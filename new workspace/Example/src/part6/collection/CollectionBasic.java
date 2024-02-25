package part6.collection;
import java.util.*;
public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 10,20,30,40,50 5개의 int를 저장하고 출력.
       List<Integer> integerList = new ArrayList<>(5);
       for (int i=1;i<6;i++) integerList.add(i*10);

       // Integer -> int auto-unboxing
       for(int num:integerList) System.out.println(num);
    }
}
