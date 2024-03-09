package 강의._3_배열;

import java.io.*;
import java.util.*;

public class 줄세우기_정렬없이_10431 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int N = 20;
        int[] students = new int[N];

        // 내 앞에를 비교하여, 나보다 크면 cnt++
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int cnt = 0;

            for(int t=0;t<N;t++){
                students[t] = Integer.parseInt(st.nextToken());
                int target = students[t];
                for(int c=0;c<t;c++){
                    if(target<students[c]) cnt++;
                }
            }
            sb.append(i+1).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
