package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 개수세기 {
    static BufferedReader br;
    static StringBuilder sb;

    static int T, count;
    static String V;
    static String[] nums;

    public static void main(String[] args) throws IOException {
        input();
        for(String n:nums) {
            if(n.equals(V)) count++;
        }
        System.out.println(count);
    }
    static void input() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        nums = br.readLine().split("\\s+");
        V = br.readLine();
    }
}
