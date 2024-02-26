package part6.collection;

import java.util.*;

public class SetBasic {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("Apple");
        set.add("Apple"); // 중복은 추가되지 않음
        set.add("Banana");
        set.add("Cherry");

        // 요소 개수 출력
        System.out.println(set.size());

        // 모든 요소 출력
        for(String fruit:set) System.out.println(fruit);

        // 요소 삭제
        set.remove("Banana");

        // 요소 포함 여부 확인
        System.out.println(set.contains("Cherry"));

        // 비우기
        set.clear();

        // 확인
        System.out.println(set.isEmpty());
    }
}
