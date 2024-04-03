package com.example.part2;

public class WhileEx {
    public static void main(String[] args) {
        int length = 3;

        int i = 1;
        while (i < length){
            System.out.println(i);// 1, 2
            i++;
        }

        int j = 1;
        do {
            System.out.println(j); // 1, 2, 3
            j++;
            if(j>length) break;
        } while(true);
    }
}
