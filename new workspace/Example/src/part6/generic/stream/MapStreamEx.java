package part6.generic.stream;
import java.util.*;
import java.util.stream.Collectors;

public class MapStreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "orange");

        List<String> uppercaseWords = words.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("대문자로 변환한 리스트: "+uppercaseWords.toString());
    }
}
