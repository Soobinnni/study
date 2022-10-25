import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemoMun {

	public static void main(String[] args) {
		/*
		 * String input = "C:\\Temp\\어쩌구.txt"; String output = "C:\\Temp\\저쩌구.txt";
		 * 
		 * try(FileReader r = new FileReader(input); FileWriter w = new
		 * FileWriter(output);) { int c;
		 * 
		 * while((c=r.read())!=-1) { w.write(c); } } catch (IOException e) {
		 * 
		 * }
		 */
		
		
		String a = "C:\\Temp\\어쩌구.txt";
		String b = "C:\\Temp\\저쩌구.txt";
		
		try (FileReader r=new FileReader(a);
				FileWriter w = new FileWriter(b)){
			int c ;
			while((c=r.read())!=-1) {
				w.write(c);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
