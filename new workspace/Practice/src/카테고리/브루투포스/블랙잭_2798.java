package 카테고리.브루투포스;

import java.io.*;
import java.util.*;

public class 블랙잭_2798 {
    /*
    * 카드의 합이 21을 넘지 않는 한도, 합을 최대한 크게 만든다.
    * N장의 카드, M을 외친다.
    * N장 중 3장을 골라 합이 M이 넘지 않으면서 가깝게 만든다.
    * */
    static BufferedReader br;
    static StringTokenizer st;
    static int N,M, cards[];
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cards = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            cards[i]= Integer.parseInt(st.nextToken());
        }
        br.close();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                
            }
        }
    }
}
