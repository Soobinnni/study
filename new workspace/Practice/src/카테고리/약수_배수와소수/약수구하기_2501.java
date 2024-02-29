package 카테고리.약수_배수와소수;

import java.io.*;
import java.util.*;

public class 약수구하기_2501 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N,K;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        // 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력
        // K번째 약수가 존재하지 않을 경우에는 0을 출력]
        if(K==1){
            System.out.println(1);
        }else{
            int answer = 0;
            int cnt = 1;
            for(int i=2;i<=N;i++){
                if(N % i==0){
                    cnt++;
                }
                if(cnt == K) {
                    answer = i;
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
