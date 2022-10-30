package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuizServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		try {
			// 서버를 작성할 때는 다른 서비스가 사용하지 않는 포트 번호를 선택하여야 하며 포트에 연결할 수 없으면 예외를 발생한다.
			serverSocket = new ServerSocket(5555);
		} catch (IOException e) {
			System.out.println("다음의 포트 번호에 연결할 수 없습니다 : 5555");
			// 포트가 사용되고 있는 경우에는 서버가 종료된다.
			// 현재 실행 중인 Java 가상 머신을 종료합니다. 인수는 상태 코드 역할을 합니다. 관례상 0이 아닌 상태 코드는 비정상적인 종료를
			// 나타냅니다.
			System.exit(1);
		}
		Socket clientSocket = null;
		try { // 클라이언트가 서버에 대하여 연결을 요청할 때까지 기다린다. 연결이 되면 새로운 포트와 연결된 Socket객체를 반환한다.
				// 서버는 클라이언트와 이 새로운 Socket을 통하여 통신할 수 있다.
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.out.println("연결 실패");
			System.exit(1);
		}

		// 서버는 클라이언트와 스트림을 이용하여 통신한다.서버는 클라이언트 소켓에 연결되어 있는 PringWriter로 정보를 출력한다.
		// 따라서 메시지가 클라이언트로 보내어진다.
		// getOutputStream() : 반환 - OutputStream, 매개변수 : 이 소켓에 대한 출력 스트림을 반환합니다.
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		String inputLine, outputLine;

		QuizProtocol qp = new QuizProtocol();
		outputLine = qp.process(null);
		out.println(outputLine);
		while ((inputLine = in.readLine()) != null) {
			outputLine = qp.process(inputLine);
			out.println(outputLine);
			if (outputLine.equals("quit")) {
				break;
			}
			out.close();
			in.close();
			clientSocket.close();
			serverSocket.close();
		}
	}

}
