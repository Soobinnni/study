package 강의._3_배열;

import java.io.*;
import java.util.*;

public class 두수의합_3273 {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        boolean[] numInfo = new boolean[1000001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            numInfo[num] = true;
        }

        int x = Integer.parseInt(br.readLine());
        br.close();

        // N의 범위가 100000이므로, 기존의 정렬은 시간초과.
        // 그런데 양의 정수가 1000000까지므로 카운트배열을 이용
        int answer = 0;
        for(int i=0;i<N;i++){
            int pairValue = x - arr[i];
            if(1<=pairValue && pairValue <= 1000000 && numInfo[pairValue]){
                answer++;
            }
        }
        System.out.println(answer/2);

        /* 범위를 x로 좁혀서 보기
        for(int i=1; i<=(x - 1)/2;i++){
            if(i <= 1000000 && x-i<=1000000 && (numInfo[i] && numInfo[x-i])){
                answer++;
            }
        }
        System.out.println(answer);*/
    }
}
