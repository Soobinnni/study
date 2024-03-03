package 카테고리.string;

import java.io.*;

public class OX퀴즈 {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        for(int i=0;i<tc;i++){
            String str = br.readLine();
            int OCount = 0;
            int sum=0;

            for(int j=0;j<str.length();j++){
                if (str.charAt(j) == 'O') sum += ++OCount;
                else OCount = 0;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
