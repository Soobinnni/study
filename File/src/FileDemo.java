import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\xpsxm\\Desktop\\미래캠퍼스");
		File[] fs = file.listFiles();
		
		for (File file2 : fs) {
			if(file2.isDirectory()) {  //.isFile()
			System.out.printf("dir : %s\n", file2); //System.out.printf("file : %s(%d bytes)\n", file2, file2.length());
		} else {
			System.out.printf("file : %s(%d bytes)\n", file2, file2.length()); //System.out.printf("dir : %s\n", file2);
		}
		}
	}

}
