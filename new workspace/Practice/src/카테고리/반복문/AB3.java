package 카테고리.반복문;

import java.util.Scanner;

public class AB3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++){
            String[] nums = sc.nextLine().split("\\s+");
            System.out.println(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1]));
        }
    }
}
