package 강의._3_배열;

import java.io.*;
import java.util.*;

public class 성지키기_1236 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int countC = 0;
        int countR = 0;
        boolean[] securityC = new boolean[M];

        // O(N * M)
        for(int i=0;i<N;i++){
            String line = br.readLine();
            boolean securityR = false;
            for(int j=0;j<M;j++){
                if(line.charAt(j)=='X') {
                    securityC[j] = true;
                    securityR = true;
                }
            }
            if(!securityR) countC++;
        }

        // O(N)
        for(boolean b:securityC) if(!b) countR++;

        int result = countR;
        if(countR<countC) result+=(countC-countR);

        System.out.println(result);

        // O(N * M) + O(N) => O(N * M)
    }
}
