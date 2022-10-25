import java.io.File;
import java.nio.file.Files;

public class FilesDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\xpsxm\\Desktop\\미래캠퍼스");
		File f2 = new File("C:\\Users\\xpsxm\\Desktop\\미래캠퍼스\\10월의 오늘은~.txt");
		
		System.out.println("미래 캠퍼스는 폴더 ? "+Files.isDirectory(f1.toPath()));
		
		System.out.println("10월의 오늘은~은 폴더?"+Files.isDirectory(f2.toPath()));
		
		System.out.println("10월의 오늘은~은 읽을 수 있는 파일?"+Files.isReadable(f1.toPath()));
		
		System.out.println("10월의 오늘은~의 크기?"+Files.size(f2.toPath()));
	}

}
