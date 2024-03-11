package 강의._4_완전탐색과시뮬레이션;

import java.io.*;
import java.util.*;

public class ACM호텔_10250 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 호텔 층 수(열)
            int W = Integer.parseInt(st.nextToken()); // 호텔 방 수(행)
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            int floor = (N - 1) % H + 1;
            int num = (N - 1) / H + 1;
            int result = floor * 100 + (num / 10) * 10 + (num % 10);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
