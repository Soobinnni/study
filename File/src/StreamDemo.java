import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Windows");
		File[] fs = file.listFiles();
		
		Stream<File> st = Arrays.stream(fs);
		long count = st.filter(x->x.isFile() == true).count(); //st.filter(x->x.isDirectory() == false).count();
		
		System.out.println("C:\\Windows에 있는 파일 개수 : "+ count);
	}

}
