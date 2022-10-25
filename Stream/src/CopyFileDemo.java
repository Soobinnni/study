import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "C:\\Temp\\org.text";
		String output = "C:\\Temp\\dup.text";
		
		try (FileInputStream fis = new FileInputStream(input);
			FileOutputStream fos = new FileOutputStream(output)) {
				int c;
				
				while((c=fis.read())!=-1) {
					fos.write(c);
				}
			}
		 catch (IOException e) { 
		}
	}

}
