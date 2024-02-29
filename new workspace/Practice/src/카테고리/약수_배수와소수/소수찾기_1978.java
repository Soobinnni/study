package 카테고리.약수_배수와소수;

import java.io.*;
import java.util.*;

public class 소수찾기_1978 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int result = 0;

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());

            int isPrime = 1;
            if(num==1) {
                isPrime -= 1;
            } else {
                int cnt = 1;
                for(int j=2;j<=num;j++){
                    if(num % j==0) cnt++;
                    if(cnt >2) {
                        isPrime -= 1;
                        break;
                    }
                }
            }
            result += isPrime;
        }

        System.out.println(result);

    }

}
