package 카테고리.일반수학1;

import java.io.*;
import java.util.*;
public class 달팽이는올라가고싶다_2869 {
    static BufferedReader br;
    static StringTokenizer st;
    static int A,B,V;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken()); // 달팽이가 낮동안 올라갈 수 있는 m
        B = Integer.parseInt(st.nextToken()); // 밤에 자는 동안 내려가는 m
        V = Integer.parseInt(st.nextToken()); // 나무의 m

//        int day = 0;
//
//
//        int curr = B;
//        while(curr < V){
//            curr -= B;
//            day++;
//            curr += A;
//        }
//        System.out.println(day);
        V = V-B;
        int day = (V + (V-1)) / (A-B);
        if(V % (A-B)>0){
            day += 1;
        }
        System.out.println(day);
    }
}
