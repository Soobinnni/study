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
		//Stream 메서드 filter()는 주어진 술어와 일치하는 이 스트림의 요소로 구성된 스트림(즉 리턴값이 스트림)을 리턴.
		//Stream 메서드 count()는 해당 스트림의 요소의 개수를 반환. 반환타입 long.
		long count = st.filter(x->x.isFile() == true).count(); //st.filter(x->x.isDirectory() == false).count();
		
		System.out.println("C:\\Windows에 있는 파일 개수 : "+ count);
	}

}
