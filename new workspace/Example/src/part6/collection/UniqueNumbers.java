package part6.collection;

import java.util.*;
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,1,3};

        Set<Integer> set = new HashSet<>();

        for(int number:numbers){
            set.add(number);
        }

        System.out.println(set.toString());
    }
}
