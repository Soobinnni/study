package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class X보다작은수 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N,X;
    static int[] nums;

    public static void main(String[] args) throws IOException {
        input();
        getSmaller();
        System.out.println(sb);
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        nums = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        br.close();
    }
    static void getSmaller(){
        for(int num:nums){
            if (num<X) sb.append(num).append(" ");
        }
    }
}
