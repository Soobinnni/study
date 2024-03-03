package 카테고리.string;

import java.io.*;
import java.util.*;

public class 단어의개수 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        byStringTokenizer();
        bySplit();
    }

    static void byStringTokenizer() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());
    }
    static void bySplit() throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
        if(str.equals("")) System.out.println(0);
        else System.out.println(str.split("\\s+").length);
        System.out.println(st.countTokens());
    }
}
