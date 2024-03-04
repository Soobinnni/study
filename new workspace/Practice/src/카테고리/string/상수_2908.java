package 카테고리.string;

import java.io.*;
import java.util.*;

public class 상수_2908 {
    static BufferedReader br;
    static StringTokenizer st;
    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        String a = new StringBuilder(st.nextToken()).reverse().toString();
        String b = new StringBuilder(st.nextToken()).reverse().toString();
        System.out.println(Math.max(Integer.parseInt(a), Integer.parseInt(b)));
    }
}
