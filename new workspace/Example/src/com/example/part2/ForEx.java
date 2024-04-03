package com.example.part2;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        int arrLen = new Scanner(System.in).nextInt();
        int[] arr = new int[arrLen];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
            System.out.print(arr[i]);
        }
        System.out.println();

        // A~Z까지의 문자와 아스키코드값 출력
        for(char a = 'A';a<='Z';a++){
            System.out.println(a);
            System.out.println((int)a);
        }

        //‘o’라는 문자를 만나면 반복을 중지하세요
        char[] c={'s','h','u','t','d','o','w','n'};

        for(char ch:c){
            if (ch == 'o') {
                System.out.println("Enter O!");
                break;
            }
            System.out.println(ch);
        }
        int cnt = 0;
        for(int i = 1;i<=10;i++){
//            if (i % 3 == 0) cnt += 1;
            if (i % 3 != 0) continue;
            cnt += 1;
        }
        System.out.println(cnt);
    }
}
