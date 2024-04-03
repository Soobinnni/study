package com.example.part2;

public class CharEx {
    public static void main(String[] args){
        char c = 'A' + 1;
        System.out.println("c = " + c);

        int cToInt = c;
        System.out.println("cToInt = " + cToInt);

        char intToChar = (char)cToInt;
        System.out.println("intToChar = " + intToChar);

        char ex = (char)3;

        // 대문자 'A'를 문자 'a'로 변환하여 출력
        char upper = 'A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower);

        // '1' + '2' + '3' + '4' + '5'  = 15
        int sum = 0;
//
//        char one = '1';
//        char two = '2';
//        char three = '3';
//        char four = '4';
//        char five = '5';
//
//        sum = (one + two + three + four + five) - (48 * 5);

//        char one = '1' - '0';
//        char two = '2' - '0';
//        char three = '3' - '0';
//        char four = '4' - '0';
//        char five = '5' - '0';
//
//        sum = one + two + three + four + five;

        char nums[] = {'1', '2', '3', '4', '5'};

        for(char num:nums){
            sum += num - '0';
        }

        System.out.println("sum = " + sum);
    }
}
