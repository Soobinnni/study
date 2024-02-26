package 카테고리.입출력과사칙연산;

import java.util.Arrays;
import java.util.Scanner;

public class 나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A = nums[0];
        int B = nums[1];
        int C = nums[2];

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}
