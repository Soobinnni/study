package 카테고리.일반수학1;

import java.io.*;
import java.util.*;

public class 진법변환2_11005 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        br.close();

        String result = "";
        while(N>0){
            int remain = N % B;
            N /= B;
            String s;
            if(remain>=10){
                s = String.valueOf((char) (remain + 55));
            } else {
                s = String.valueOf(remain);;
            }
            result += s;
        }
        System.out.println(new StringBuilder(result).reverse());
    }
}