package 카테고리.string;

import java.util.Scanner;


class 대소문자변환 {
    static Scanner sc = new Scanner(System.in);
    static String str;
    static StringBuilder sb = new StringBuilder();
    static void input(){
        str = sc.next();
    }
    static void print(){
        System.out.println(sb);
    }
    public static void main(String args[]) {
        input();
//        ASCII_code를_이용한_대소문자_변환_charArr();
        ASCII_code를_이용한_대소문자_변환_charAt();
        print();
    }

    private static void ASCII_code를_이용한_대소문자_변환_charArr(){
        for(int i=0;i<str.length();i++){
            char strCharAt = str.charAt(i);
            if(strCharAt >= 'A' && strCharAt <= 'Z') {
                sb.append((char)('a' + strCharAt - 'A'));
            } else {
                sb.append((char)('A' + strCharAt - 'a'));
            }
        }


//        String str = sc.next();
//        char[] charArr = str.toCharArray();
//
//        for (int i = 0; i < str.length(); i++) {
//            if ('A' <= charArr[i] &&  charArr[i] <= 'Z') {
//                charArr[i] = (char) ('a' +  charArr[i] - 'A');
//            } else {
//                charArr[i] = (char) ('A' +  charArr[i] - 'a');
//            }
//        }
//        System.out.println(charArr);
    }
    private static void ASCII_code를_이용한_대소문자_변환_charAt(){
        char[] strCharArr = str.toCharArray();
        for(int i=0;i<strCharArr.length;i++){
            if ('A' <= strCharArr[i] &&  strCharArr[i] <= 'Z') {
                sb.append((char) ('a' +  strCharArr[i] - 'A'));
            } else {
                sb.append((char) ('A' +  strCharArr[i] - 'a'));
            }
        }
//        String str = sc.next();
//        for(int i=0;i<str.length();i++){
//            char strCharAt = str.charAt(i);
//            if('A'<=strCharAt && strCharAt<='Z'){
//                // 대문자라면
//                System.out.print((char)('a' + strCharAt - 'A'));
//            } else{
//                // 소문자라면
//                System.out.print((char)('A' + strCharAt - 'a'));
//            }
//        }
    }
}