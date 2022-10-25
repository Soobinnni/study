import java.nio.charset.*;
import java.nio.file.*;
import java.util.List;
import java.io.*;
import java.nio.file.AccessDeniedException;


public class Files2Demo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Charset cs = Charset.defaultCharset();
		Path p = new File("C:\\Users\\xpsxm\\Desktop\\새폴더").toPath();
		
		if(Files.notExists(p)) {
			Files.createFile(p);}

		
		byte[] data = "좋은 아침\n잘 가세요!".getBytes();
		Files.write(p, data, StandardOpenOption.APPEND); //파일 작업용 표준 옵션 중 하나로 data를 파일 끝에 추가한다.
		
		try {
			List<String> lines = Files.readAllLines(p, cs);
			
			for (String line : lines) {
				System.out.println(line);
			}
			
		}catch(IOException e){
			
		}
	}

}
