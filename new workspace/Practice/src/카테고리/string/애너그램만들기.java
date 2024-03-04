package 카테고리.string;

import java.util.Scanner;

// 포인트: 카운트 배열을 이용한다.
public class 애너그램만들기 {
    static Scanner sc = new Scanner(System.in);
    static String str1, str2;
    static int[] count1 = new int[26]; //알파벳은 소문자만 주어지며 총 26자이므로
    static int[] count2 = new int[26]; //알파벳은 소문자만 주어지며 총 26자이므로
    static int cnt = 0;

    public static void main(String[] args) {
        input();
        assignCount(str1, count1);
        assignCount(str2, count2);
        count();
        print();
    }
    static void input(){
        str1 = sc.nextLine();
        str2 = sc.nextLine();
    }
    static void print(){
        System.out.println(cnt);
    }
    static void assignCount(String str, int[] count){
        for(int i=0;i<str.length();i++){
            count[str.charAt(i) - 'a']++; // 카운트 카테고리.배열
        }
    }

    static void count(){
        for(int i=0;i<26;i++){
            if(count1[i]>count2[i]){
                cnt += count1[i] - count2[i];
            }
            if(count1[i]<count2[i]){
                cnt += count2[i] - count1[i];
            }
        }
    }
}
