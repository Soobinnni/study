package echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class Echo1Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket sever = null;
		Socket connection = null;
		BufferedReader in = null;
		
		try {//서버 소켓 생성
			sever = new ServerSocket(5000);
		} catch (IOException e) {

		}
		//클라이언트가 소캣을 생성해서 서버 연결을 요청할 것.
		System.out.println("연결 대기 중 ...");
		
		try { //연결을 승인한다.
			connection = sever.accept();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		System.out.println("메세지를 기다리는 중...");
		//클라이언트의 연결된 소켓으로 메시지를 보냈고 ->연결된 소켓으로 메시지를 받는다.
		in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
		 String msg;

		 while ((msg = in.readLine())!=null) { //String readLine() : 한 행을 읽어 문자열로 반환한다.
			if(msg.contains("끝")) { //String의 메서드 boolean contains(charSequence s) : 이 문자열에 char 값의 지정된 시퀀스가 포함된 경우에만 true를 반환합니다.
				break;
			}
			System.out.println("읽은 메시지 메아리 : "+msg);
		}
		 
		 System.out.println("서버 종료");
		 //역순으로 닫아야 한다 순서 중요!
		 in.close();
		 connection.close();
		 sever.close();
	}

}
