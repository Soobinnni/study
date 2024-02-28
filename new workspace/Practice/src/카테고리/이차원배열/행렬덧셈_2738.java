package 카테고리.이차원배열;

import java.io.*;
import java.util.*;

public class 행렬덧셈_2738 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int[][] A = new int[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) A[i][j] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++) sb.append(A[i][j] + Integer.parseInt(st.nextToken())).append(" ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
