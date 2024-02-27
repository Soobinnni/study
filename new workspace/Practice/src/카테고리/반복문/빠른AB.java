package 카테고리.반복문;

import java.io.*;
import java.util.StringTokenizer;

public class 빠른AB {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br= new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int N = parseInt(br.readLine());

        for (int i=0;i<N;i++){
            // 공백을 기준으로 문자열을 토큰으로 분리하기 위해 StringTokenizer를 사용
            st = new StringTokenizer(br.readLine());
            int a=parseInt(st.nextToken());
            int b=parseInt(st.nextToken());
            sb.append(a+b+"\n");
        }
        System.out.println(sb);
        br.close();
    }
    static int parseInt(String numStr) {
        return Integer.parseInt(numStr);
    }
}