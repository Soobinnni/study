package 카테고리.약수_배수와소수;

import java.io.*;
import java.util.*;
public class 배수와약수_5086 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    static int A,B,V;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0&&b==0) break;

            // 첫 번째 숫자가 두 번째 숫자의
            //                          약수라면 factor
            //                          배수라면 multiple
            //                          아니라면 neither
            if(b%a==0) sb.append("factor");
            else if(a%b==0) sb.append("multiple");
            else sb.append("neither");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
