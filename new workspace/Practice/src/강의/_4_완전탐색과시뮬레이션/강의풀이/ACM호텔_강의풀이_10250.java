package 강의._4_완전탐색과시뮬레이션.강의풀이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔_강의풀이_10250 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 호텔 층 수(열)
            int W = Integer.parseInt(st.nextToken()); // 호텔 방 수(행)
            int N = Integer.parseInt(st.nextToken()); // 몇 번째 손님

            int floor=1;
            int distance=1;
            while(--N>0){
                floor++;
                if(floor>H){
                    floor=1;
                    distance++;
                }
                if(distance>W){
                    distance=1;
                }
            }
            int result = floor * 100 + (distance / 10) * 10 + (distance % 10);
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}