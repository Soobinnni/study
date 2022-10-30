import java.nio.charset.*;
import java.nio.file.*;
import java.util.List;
import java.io.*;
import java.nio.file.AccessDeniedException;

public class Files2Demo {

	public static void main(String[] args) throws Exception{
		// 파일의 경로는 Path가 제공
		Charset cs = Charset.defaultCharset();
		Path p = new File("C:\\Users\\xpsxm\\Desktop\\새폴더").toPath();
		
		//Path에게 받은 경로 객체에 Files가 파일에 대한 연산을 수행
		if(Files.notExists(p)) {
			Files.createFile(p);}

		﻿//Path write(Path path, byte[] bytes, OpenOption... options). getBytes는 String
		byte[] data = "좋은 아침\n잘 가세요!".getBytes();
		Files.write(p, data, StandardOpenOption.APPEND); //파일 작업용 표준 옵션 중 하나로 data를 파일 끝에 추가한다.
		
		try {
			//위에서 파일생성과, 파일의 내용을 입력한 것을 다시 List컬렉션으로 가져옴.
			List<String> lines = Files.readAllLines(p, cs);
			
			lines.forEach(x -> System.out.println(x));
		}catch(IOException e){
			
		}
	}

}
