package 카테고리.이차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최댓값_2566 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int maxR = 0;
        int maxC = 0;

        for(int i=0;i<9;i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                if(max<n){
                    max = n;
                    maxR = i;
                    maxC = j;
                }
            }
        }
        sb.append(max).append("\n").append(maxR+1).append(" ").append(maxC+1);
        System.out.println(sb);
    }
}
