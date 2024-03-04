package 카테고리.string;

import java.io.*;
import java.util.*;

public class 문자열반복 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] c = (st.nextToken()).toCharArray();
            for(char cr:c)
                for (int j=0;j<R;j++) sb.append(cr);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
