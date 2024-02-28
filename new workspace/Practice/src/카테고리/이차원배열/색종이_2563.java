package 카테고리.이차원배열;

import java.io.*;
import java.util.*;

public class 색종이_2563 {
    static BufferedReader br;
    static StringTokenizer st;
    static int paperNum;
    static boolean paper[][];

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        paper = new boolean[100][100];

        paperNum = Integer.parseInt(br.readLine());
        int result=0;

        for(int i=0;i<paperNum;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int r=x;r<x+10;r++){
                for(int c=y;c<y+10;c++){
                    if(!paper[r][c]) result++;
                    paper[r][c] = true;
                }
            }
        }
        System.out.println(result);
    }
}
