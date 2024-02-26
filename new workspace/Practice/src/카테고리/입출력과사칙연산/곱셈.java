package 카테고리.입출력과사칙연산;
import java.util.Scanner;

public class 곱셈 {
    static Scanner sc = new Scanner(System.in);
    static int num1, num2;

    public static void main(String[] args) {
        input();
        String numStr = String.valueOf(num2);
        int one = Integer.parseInt(numStr.substring(2,3));
        int ten = Integer.parseInt(numStr.substring(1,2));
        int hundred = Integer.parseInt(numStr.substring(0,1));

        System.out.println(multiple(one));
        System.out.println(multiple(ten));
        System.out.println(multiple(hundred));
        System.out.println(multiple(num2));
    }
    static void input(){
        num1 = sc.nextInt();
        sc.nextLine();
        num2 = sc.nextInt();
    }

    static int multiple(int num){
        return num1 * num;
    }
}
