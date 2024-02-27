package 카테고리.반복문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기1 {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        String str = "*";
        for(int i=0;i<T;i++){
            sb.append(str).append("\n");
            str += "*";
        }
        System.out.println(sb);

    }
}
