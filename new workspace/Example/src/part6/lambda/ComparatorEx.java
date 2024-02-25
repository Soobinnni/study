package part6.lambda;

import java.util.*;

public class ComparatorEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        // 문자열을 길이에 따라 정렬하는 Comparator 람다식
        Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());
        Comparator<String> desc = (str1, str2) -> str1.compareTo(str2);

        // 리스트를 정렬
        Collections.sort(names, desc);

        // 정렬된 결과 출력
        System.out.println("정렬된 리스트:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
