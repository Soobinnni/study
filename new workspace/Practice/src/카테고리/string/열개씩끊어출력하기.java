package 카테고리.string;

import java.io.*;

public class 열개씩끊어출력하기 {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int lastNotOutOfIndex = str.length()/10;
        int outOfIndexStart = (lastNotOutOfIndex * 10);

        sb = new StringBuilder();
        for(int i=0;i<lastNotOutOfIndex;i++){
            sb.append(str.substring(i * 10, (i*10)+10)).append("\n");
        }
        sb.append(str.substring(outOfIndexStart, str.length()));

        System.out.println(sb);
    }
}
