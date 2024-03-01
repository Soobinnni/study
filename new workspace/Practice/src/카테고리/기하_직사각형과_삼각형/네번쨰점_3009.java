package 카테고리.기하_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class 네번쨰점_3009 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] xy = new int[6];
        for (int i = 0; i < 3; i++) {
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            xy[2*i] = a;
            xy[2*i+1] = b;
        }

        int x=xy[4];
        int y=xy[5];


        if(x==xy[0]) x=xy[2];
        else if(x==xy[2]) x=xy[0];
        if(y==xy[1]) y=xy[3];
        else if(y==xy[3]) y=xy[1];
        System.out.println(x+" "+y);
    }
}
