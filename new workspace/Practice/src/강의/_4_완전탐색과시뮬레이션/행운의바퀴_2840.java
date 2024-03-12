package 강의._4_완전탐색과시뮬레이션;

import java.io.*;
import java.util.*;

public class 행운의바퀴_2840 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 글자 수
        int K = Integer.parseInt(st.nextToken()); // 돌리는 횟수
        boolean[] isDuplicate = new boolean[26];

        String[] wheel = new String[N];
        Arrays.fill(wheel, "?");
//        st = new StringTokenizer(br.readLine());
//        st.nextToken();
//        String firstAlphabet=st.nextToken();
//        wheel[0] = firstAlphabet;
//        isDuplicate[firstAlphabet.charAt(0)-'A']=true;
        int lastIdx = 0;
        boolean notAppropriate = false;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
//            int move = Integer.parseInt(st.nextToken()) % N;
            int move = Integer.parseInt(st.nextToken());
            String alphabet = st.nextToken();
            int nextIdx = ((lastIdx-move) % N + N) % N;
//            int nextIdx = lastIdx ;
//            for (int m = 0; m < move; m++) {
//                nextIdx--;
//                if (nextIdx < 0) nextIdx = N - 1;
//            }
//            if (lastIdx < move) {
//                nextIdx = lastIdx;
//                while (move-- >= 0) {
//                    if (nextIdx-- == 0) {
//                        move--;
//                        nextIdx = N - 1;
//                    }
//                }
//            } else {
//                nextIdx = lastIdx - move;
//            }

            // 내 자리에 누가 있는데 알파벳이 같지 않을 때
            String a = wheel[nextIdx];
            if (!a.equals("?") && !alphabet.equals(a)) {
                notAppropriate = true;
                break;
            }
            // 내 알파벳이 다른 어딘가에 있을 때
            if (!isDuplicate[alphabet.charAt(0) - 'A']) {
                isDuplicate[alphabet.charAt(0) - 'A'] = true;
            } else if (!alphabet.equals(a)) {
                notAppropriate = true;
                break;
            }
            wheel[nextIdx] = alphabet;
            lastIdx = nextIdx;
        }
        br.close();

        // 최종 출력
        if (notAppropriate) {
            System.out.println("!");
        } else {
            for (int m = 0; m < N; m++) {
                sb.append(wheel[(lastIdx + m) % N]);
//                if(lastIdx++ == N - 1) lastIdx=0;
            }
//            int move = N;
//            while (move-- >= 0) {
//                sb.append(wheel[lastIdx]);
////                if (element == null) {
////                    sb.append('?');
////                } else {
////                    sb.append(element);
////                }
//                if (lastIdx++ == N - 1) {
//                    move--;
//                    lastIdx = 0;
//                }
//            }
            System.out.println(sb);
        }
    }
}