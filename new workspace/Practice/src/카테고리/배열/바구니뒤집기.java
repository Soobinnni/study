package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 바구니뒤집기 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] basket;
    static int N, M;

    public static void main(String[] args)throws IOException {
        input();
        System.out.println(sb);
        br.close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        basket = new int[N];
        for(int i=0;i<N;i++) basket[i] = i+1;

        M = Integer.parseInt(st.nextToken());

        for(int j=0;j<M;j++){
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken()) - 1;
            int endIdx = Integer.parseInt(st.nextToken()) - 1;

            while(startIdx<endIdx){
                int temp = basket[endIdx];
                basket[endIdx] = basket[startIdx];
                basket[startIdx] = temp;
                startIdx++;
                endIdx--;
            }
        }

        for(int order:basket) sb.append(order).append(" ");
    }
}
