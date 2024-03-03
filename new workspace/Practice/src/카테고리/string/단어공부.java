package 카테고리.string;

import java.util.*;

public class 단어공부 {
    static Scanner sc = new Scanner(System.in);
    static String str;
    static char answer;
    static int[] cnt= new int[26];

    public static void main(String[] args) {
//        byCountArr();
        byChar();
    }

    public static void byCountArr(){
        input();
        countAlphabet();
        getAnswer();
        System.out.println(answer);
    }

    public static void byChar(){
        input();
        getAnswerByChar();
        System.out.println(answer);
    }
    public static void input(){
        str = sc.next().toUpperCase();
    }
    public static void countAlphabet(){
        for(int i=0;i<str.length();i++){
            cnt[str.charAt(i)-'A'] ++;
        }
    }
    public static void getAnswer(){
        answer = '?';
        int max = -1;

        for(int i=0;i<26;i++){
            if(cnt[i]==max) answer = '?';
            if(cnt[i]>max) {
                max = cnt[i];
                answer = (char) (i + 'A');
            }
        }
    }


    public static void getAnswerByChar(){
        int count = 0;
        int max = -1;
        for(char c='A';c<='Z';c++){
            count = countAlphabetCount(c);
            if(count > max){
                max = count;
                answer = c;
            } else if(count == max){
                answer = '?';
            }
        }
    }
    public static int countAlphabetCount(char alphabet){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(alphabet==str.charAt(i)) count += 1;
        }
        return count;
    }
}
