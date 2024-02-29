package 카테고리.일반수학1;

import java.io.*;
import java.util.*;

public class 진법변환_2745 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        String N = st.nextToken(); //                ex: ZZZZZ
        int B = Integer.parseInt(st.nextToken()); // ex: 36
        br.close();

        // B진법 수 N을 10진법으로 바꾼다.
        // 36진법 수 ZZZZZ을 10진법으로 바꾼다.
        // 10진법을 넘어가면 A-10 ... Z-35로 표현
        // 모든 진법은 10진수로 변환하려면, 진법 x일 때 n * x^(자리수)
        long result = 0;
        int multipleNum=0;
        for(int i=N.length()-1;i>=0;i--){
            char c = N.charAt(i);
            int num;
            if('0'<=c && '9'>= c){
                num = c - '0';
            } else{
                num = c - 55;
            }
            int convereNum = (int)(Math.pow(B,multipleNum++) * num);
            result += convereNum;
        }
        System.out.println(result);
    }
}
