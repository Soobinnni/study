package Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatHandler extends Thread {
	private Socket s;
	private BufferedReader i;
	private PrintWriter o;
	private ChatServer server;
	
	
	public ChatHandler(ChatServer server,Socket s) throws IOException{
		this.s = s;
		this.server = server;
		//클라이언트와 통ㅇ신할 수 있는 Socket을 통해서 BufferedReader와 PrintWrite르르 만든다.
		InputStream ins = s.getInputStream();
		OutputStream os = s.getOutputStream();
		i = new BufferedReader(new InputStreamReader(ins));
		o = new PrintWriter(new OutputStreamWriter(os),true);
	}
	
	public void run() {
		String name = "";
		try {
			//클라이언트로부터 전달되는 첫 번째 메시지는 채팅이름
			name = i.readLine();
			server.register(this);
			
			broadcast(name + "님이 방문하셨습니다.");
			while (true) {
				String msg = i.readLine();
				broadcast(name+" - "+msg);
			}
		} catch (IOException e) {
			PringDebugMessage.print(e);
		}
		
		server.unregister(this);
		broadcast(name+"님이 나가셨습니다.");
		try {
			i.close();
			o.close();
			s.close();
		} catch (IOException e) {
			PringDebugMessage.print(e);
		}
	}
	
	protected void println(String message) {
		o.println(message);
	}
	
	protected void broadcast(String message) {
		server.broadcast(message);
	}
	
	
}
