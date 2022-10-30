import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Stream2Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		Path p = new File("C:\\Users\\xpsxm\\Desktop\\새 폴더\\test.txt").toPath();

		Stream<String> s = Files.lines(p);

		s.forEach(x -> System.out.println(x));

		// 스트림은 한 번만 사용할 수 있으므로 다시 생성했다. cf. Iterator
		s = Files.lines(p);

		// Stream 인터페이스의 map->주어진 함수를 이 스트림의 요소에 적용한 결과로 구성된 스트림을 반환.
		s.map(x -> number[Integer.parseInt(x)]).forEach(x -> System.out.print(x + " "));

	}

}
