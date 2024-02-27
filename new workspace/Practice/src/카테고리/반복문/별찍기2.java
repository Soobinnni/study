package 카테고리.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기2 {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String stars = "*";

        for (int i=1;i<=T;i++){
            for(int j=0;j<T-i;j++){
                sb.append(" ");
            }
            sb.append(stars).append("\n");
            stars += "*";
        }
        System.out.println(sb);
    }
}
