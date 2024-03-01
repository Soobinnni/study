package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공넣기 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int N, M; // N:바구니 수 M:공을 넣는 횟수
    static int[] basket;

    public static void main(String[] args) throws IOException {
        input();
        for(int n:basket) sb.append(n).append(" ");
        System.out.println(sb);
        br.close();
    }
    // M개의 i,j,k 정보. i~k바구니까지 k번 번호가 적혀진 공을 넣는다.
    static void input() throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        basket = new int[N];
        for (int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int startIdx = Integer.parseInt(st.nextToken())-1;
            int lastIdx = Integer.parseInt(st.nextToken())-1;
            int target = Integer.parseInt(st.nextToken());

            for(int j=startIdx;j<=lastIdx;j++){
                basket[j] = target;
            }
        }
    }
}
