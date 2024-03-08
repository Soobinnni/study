package 강의._2_시간복잡도;

import java.util.*;
import java.io.*;
public class 개미_10158 {
    static BufferedReader br;
    static StringTokenizer st;
    static int w, h, p, q, t;
    public static void main(String[] args)throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        p = Integer.parseInt(st.nextToken());
        q = Integer.parseInt(st.nextToken());

        t = Integer.parseInt(br.readLine());

        br.close();

        // 0,0 -> w, h 까지 격자에서
        // p, q에 위치에 있는 개미가 대각선으로 이동. 경계에 부딪치면 같은 속력으로 반사되어 움직임
        // t시간 뒤에 어디에?
        // (n,0), (행,n), (열,4), (0,n)

//        대각선 이동은 (+1, +1), 튕길 때 (-1,-1)
        /*int dir = 0; // 2,3,4; 오른쪽 위 대각선 | 왼쪽 위 대각선 | 왼쪽 아래 대각선 | 오른쪽 아래 대각선
        int[] dp = {1, -1, -1, 1};
        int[] dq = {1, 1, -1, -1};*/

//        int dp = 1;
//        int dq = 1;
//
//        // 시간초과가 발생하는 코드.
//        for(int i=0;i<t;i++){
//            if(p==w) dp = -1;
//            if(p==0) dp = 1;
//            if(q==h) dq = -1;
//            if(q==0) dq = 1;
//
//            p+=dp;
//            q+=dq;
//        }

        // 주기를 탐색하면, dp와 dq는 따로 변하기 때문에 규칙적으로 경계면에 대해 왕복운동인 것을 파악할 수 있다.

        System.out.println(getPosition(p, w)+" "+getPosition(q, h));


    }

    static int getPosition(int curr, int goal){
        int delta = 1;
        int time = t % (2 * goal);
        while(time-- >0){
            if(curr == goal) delta = -1;
            else if(curr == 0) delta = 1;

            curr += delta;
        }
        return curr;
    }

    static void getP(){
        int curP = (p+t) % (2*w);
        int curQ = (q+t) % (2*h);

        if(curP>w) curP = 2*w-curP;
        if(curQ>h) curQ = 2*h-curQ;

        System.out.println(curP+" "+curQ);
    }
}
