package com.example.part2;

import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if ( (year%4==0 && year%100!=0) ||(year%400==0)){
            System.out.println("윤년");
        } else{
            System.out.println("윤년 아님");
        }
    }
}
