package 카테고리.반복문;

import java.util.Scanner;

public class 구구단 {
    static Scanner sc = new Scanner(System.in);
    static int num;

    public static void main(String[] args) {
        input();
        print();
    }
    static void input(){
        num = sc.nextInt();
    }
    static void print(){
        for(int i=1;i<10;i++){
            System.out.println(num + " * " + i + " = "+ (num*i));
        }
    }
}
