package 카테고리.반복문;

import java.util.Scanner;

public class 코딩은체육과목입니다 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = sc.nextInt();
        int lastIdx = size / 4;
        for (int i=0;i<lastIdx;i++) System.out.print("long ");
        System.out.print("int");
    }
}
