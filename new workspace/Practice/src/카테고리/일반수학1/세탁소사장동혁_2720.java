package 카테고리.일반수학1;

import java.io.*;
public class 세탁소사장동혁_2720 {
    static BufferedReader br;
    static final int[] unit = {25, 10, 5, 1};
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int remain = Integer.parseInt(br.readLine());
            for(int u:unit){
                int cnt = remain / u;
                sb.append(cnt).append(" ");
                remain = remain % u;
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}
