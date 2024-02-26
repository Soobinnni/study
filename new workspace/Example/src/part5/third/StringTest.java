package part5.third;

import java.util.Arrays;
import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {
        // Heap
        String str1 = new String("new String");
        String str2 = new String("new String");

        // Literal Pool
        String str3 = "new String";
        String str4 = "new String";
        String str5 = null;

        System.out.println(Objects.equals(str5, str4));

        // String Methods
//        System.out.println(str1.charAt(2));
//        System.out.println(str1.replaceAll("n", "N"));
//        System.out.println(str1.indexOf("S")); // 없으면 -1 반환
//        System.out.println(str1.length());
//        System.out.println(str1.toLowerCase());
//        System.out.println(str1.toUpperCase());
//        System.out.println(str1.substring(0,5)); // 0이상 5미만 문자열 가져옴
//        System.out.println(str1.substring(5)); // 5이상 문자열 가져옴


//        int result = "a".compareTo("c");
//        if(result == 0){
//            System.out.println("같은 문자열");
//        } else if(result > 0){
//            System.out.println("a가 c보다 사전순으로 뒤에 있음");
//        } else{
//            System.out.println("a가 c보다 사전순으로 앞에 있음");
//        }

        System.out.println((str1.split("\\s+")).toString());
    }
}
