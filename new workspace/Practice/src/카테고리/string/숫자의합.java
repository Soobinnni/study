package 카테고리.string;

import java.io.*;
import java.util.*;

public class 숫자의합 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        String nums = br.readLine();

        for (int i = 0; i < nums.length(); i++) sum += nums.charAt(i) - '0';
        System.out.println(sum);


        br.close();
    }
}
