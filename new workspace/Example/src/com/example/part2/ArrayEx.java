package com.example.part2;

import com.example.object.*;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args){
        char c[] = {'A', 'P', 'P', 'L', 'E'};

        for (int i=0; i < c.length; i++){
            System.out.print((char)(c[i]+32));
        }

        Book[] b = new Book[3];

        b[0] = new Book("제목", 1000, "한빛", "김수빈", 10, "32532");
        b[1] = new Book(b[0]);
        b[2] = new Book("제목2", 200, "룰루", "김용구", 130, "23656");


        for (int i=0; i < b.length; i++){
            System.out.println(b[i]);
        }

//         2차원 배열
//         3명의 학생의 3개의 과목 성적(국어, 영어 , 수학)을 처리하기
        int[][] a = new int[3][4];
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        // 열의 개수가 다른 2차원 배열 만들기
        char[][] df = new char[5][];

        for(int i = 0;i<df.length;i++){
            df[i] = new char[i+1];
            for(int j = 0;j<df[i].length;j++){
                df[i][j] = '*';
                System.out.print(df[i][j]);
            }
            System.out.println();
        }

    }
}
