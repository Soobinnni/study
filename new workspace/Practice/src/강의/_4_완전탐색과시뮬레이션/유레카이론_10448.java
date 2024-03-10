package 강의._4_완전탐색과시뮬레이션;

import java.io.*;

public class 유레카이론_10448 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //45
        for(int i=0;i<N;i++){
            int K = Integer.parseInt(br.readLine());
            find(K);
        }
        // Tn = 1 + 2 + 3 + ... + n = n(n+1)/2
        // 모든 자연수가 최대 3개의 삼각수의 합으로 표현 가능
        /*4 = T1 + T2
        5 = T1 + T1 + T2
        6 = T2 + T2 or 6 = T3
        10 = T1 + T2 + T3 or 10 = T4*/
        System.out.println(sb);
    }
    static void find(int K){
        for(int j=1;j<K;j++){
            int firstT = j*(j+1)/2;
            for(int k=1;k<K;k++){
                int secondT = k*(k+1)/2;
                for(int l=1;l<K;l++){
                    int thirdT = l*(l+1)/2;
                    if(firstT+secondT+thirdT==K) {
                        sb.append(1).append("\n");
                        return;
                    }
                }
            }
        }
        sb.append(0).append("\n");
    }
}
