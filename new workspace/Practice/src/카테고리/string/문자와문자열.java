package 카테고리.string;

import java.io.*;

public class 문자와문자열 {
    static BufferedReader br;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int index = Integer.parseInt(br.readLine())-1;

        System.out.println(str.charAt(index));
    }
}
