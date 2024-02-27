package 카테고리.반복문;

import java.util.Scanner;

public class 영수증 {
    static Scanner sc = new Scanner(System.in);
    static int total, N;

    public static void main(String[] args) {
        input();
        int sum=0;
        for(int i=0;i<N;i++){
            String[] info=sc.nextLine().split("\\s+");
            sum+=(Integer.parseInt(info[0]) * Integer.parseInt(info[1]));
        }
        boolean correct = total == sum;
        System.out.println(correct?"Yes":"No");
    }
    static void input(){
        total = sc.nextInt();
        sc.nextLine();
        N = sc.nextInt();
        sc.nextLine();
    }
}
