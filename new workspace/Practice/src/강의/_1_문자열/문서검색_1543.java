package 강의._1_문자열;

import java.util.Scanner;

public class 문서검색_1543 {
    static Scanner sc=new Scanner(System.in);
    static String doc, search;
    static int count;
    public static void main(String[] args) {
//        searchWordByIndexOf();
        searchWordByReplace();
    }
    static void input(){
        doc = sc.nextLine();
        search = sc.nextLine();
    }

    static void searchWordByIndexOf(){
        input();
        search1();
        System.out.println(count);
    }
    static void searchWordByReplace(){
        input();
        search2();
        System.out.println(count);
    }
    static void search1(){
        int startIdx = 0;
        while(true){
            int findIdx = doc.indexOf(search, startIdx);
            if(findIdx<0) break;
            count++;
            startIdx = findIdx + search.length();
        }
    }
    static void search2(){
        int docL = doc.length();
        int searchL = search.length();

        int replaceL = doc.replaceAll(search, "").length();

        count = (docL - replaceL) / searchL;
    }
}