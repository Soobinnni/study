package 강의._2_시간복잡도;

import java.io.*;
import java.util.*;

public class 알고리즘_수업__점근적_표기1_24313 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int a1= Integer.parseInt(st.nextToken());
        int a0= Integer.parseInt(st.nextToken());
        int c= Integer.parseInt(br.readLine());
        int n0= Integer.parseInt(br.readLine());
        br.close();

        if (a1*n0 + a0 <= c*n0 && c >= a1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
