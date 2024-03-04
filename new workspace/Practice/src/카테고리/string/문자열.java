package 카테고리.string;

import java.io.*;

public class 문자열 {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        for(int i=0;i<tc;i++){
            String str = br.readLine();
            String rs = str.substring(0,1)+str.substring(str.length()-1);
            sb.append(rs).append("\n");
        }
        System.out.println(sb);
    }
}
