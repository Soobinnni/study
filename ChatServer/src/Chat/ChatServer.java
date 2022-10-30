package Chat;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
	// handlers는 ChatHandler를 관리하기 위한 벡터 타입의 멤버 필드
	private Vector handlers;

	public ChatServer(int port) {
		try {
			ServerSocket server = new ServerSocket(port); // ServerSocket 생성
			handlers = new Vector();
			System.out.println("ChatServer is ready");
			while (true) {
				Socket client = server.accept();
				// 클라이언트와 통신할 수 있는 Socket을 이용해서 ChatHandler를 생성. ChatHandler는 스레드로부터 상속받은 클래스다.
				ChatHandler c = new ChatHandler(this, client);
				c.start();
			}
		} catch (Exception e) {
			PringDebugMessage.print(e);
		}
	}

	public Object getHandler(int index) {
		return handlers.elementAt(index);
	}

	public void register(ChatHandler c) {
		// 새로운 ChatHandler를 등록하기 위한 메소드
		handlers.addElement(c);
	}

	public void unregister(Object o) {
		// handlers에서 ChatHandler를 제거하기 위한 메소드
		handlers.removeElement(o);
	}

	// handlers에 등록된 모든 ChatHandler에게 message를 전달하기 위한 메소드
	public void broadcast(String message) {
		// 메시지를 전송하는 동안에 새로운 ChatHandler가 추가되거나 기존ChatHandler가 삭제되지 않도록 handler에 Lock을
		// 걸어놓고 작업한다.
		synchronized (handlers) {
			int n = handlers.size();
			for (int i = 0; i < n; i++) {
				ChatHandler c = (ChatHandler) handlers.elementAt(i);
				try {
					c.println(message);
				} catch (Exception e) {
					PringDebugMessage.print(e);
				}
			}

		}

	}

	public static void main(String args[]) {
		ChatServer server = new ChatServer(9830);
	}

}
