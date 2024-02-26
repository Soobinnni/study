package 카테고리.입출력과사칙연산;

import java.util.Arrays;
import java.util.Scanner;

public class 꼬마정민 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long result = Arrays.stream(sc.nextLine().split("\\s+")).mapToLong(Long::parseLong).sum();

        System.out.println(result);
    }
}
