import java.io.*;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try (Socket client = new Socket("192.168.0.3", 5000);
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);){
			
			oos.writeObject("지윤언니 안녕, 단순 서버야");
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
