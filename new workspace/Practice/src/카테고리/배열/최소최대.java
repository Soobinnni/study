package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static long max = -1000001;
    static long min = 1000001;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(st.nextToken());
            if (max < num) max = num;
            if (min > num) min = num;
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        br.close();
    }
}
