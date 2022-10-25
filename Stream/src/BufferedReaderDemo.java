import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		
		String upseok = "C:\\Temp\\세종대왕 업적.txt";
		
		try (BufferedReader buffer = new BufferedReader(new FileReader(upseok))){
			buffer.lines().forEach(s->System.out.println(s));
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
