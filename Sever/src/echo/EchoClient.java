package echo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Socket client = null;
		PrintWriter out = null;

		try {
			client = new Socket();
			System.out.println("에코 서버와 연결 시도...");
			client.connect(new InetSocketAddress("localhost", 5000), 3000);
			System.out.println("에코 서버와 연결 성공...");
		} catch (Exception e) {
			// TODO: handle exception
		}

		out = new PrintWriter(client.getOutputStream(), true);

		Scanner in = new Scanner(System.in);
		String msg;

		System.out.println("보낼 메시지가 있나요 ? ");
		while ((msg = in.nextLine()) != null) {
			if (msg.contains("끝")) {
				break;
			}
			out.println(msg);
			System.out.println("보낼 메시지가 더 있나요?");
		}

		System.out.println("클라이언트 종료");

		// 역순으로 닫는다.
		out.close();
		in.close();
		client.close();
	}

}
