package 카테고리.반복문;

import java.util.Scanner;

public class 합 {
    static Scanner sc = new Scanner(System.in);
    static int result;

    public static void main(String[] args) {
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            result+=i;
        }
        System.out.println(result);
    }
}
