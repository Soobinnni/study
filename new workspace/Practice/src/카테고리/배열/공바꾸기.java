package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공바꾸기 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M;
    static int[] basket;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
        br.close();
    }
    static void input() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        basket = new int[N];
        for (int i=0;i<N;i++){
            basket[i] = i+1;
        }

        for (int j=0;j<M;j++){
            st = new StringTokenizer(br.readLine());
            int replaceIdx1 = Integer.parseInt(st.nextToken());
            int replaceIdx2 = Integer.parseInt(st.nextToken());
            int temp = basket[replaceIdx2-1];

            basket[replaceIdx2-1] = basket[replaceIdx1-1];
            basket[replaceIdx1-1] = temp;
        }
        for (int k:basket) sb.append(k).append(" ");
    }
}
