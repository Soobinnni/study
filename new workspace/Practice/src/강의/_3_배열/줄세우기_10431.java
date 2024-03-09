package 강의._3_배열;

import java.io.*;
import java.util.*;

public class 줄세우기_10431 {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int N = 20;
        int[][] students = new int[T][N];
        int[] answer = new int[T];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            for (int j = 0; j < N; j++) {
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < T; i++) {
            for(int target=1;target<N;target++){
                while(target>0){
                    int targetStudent = students[i][target];
                    int compare = target - 1;

                    if(students[i][compare]>targetStudent){
                        students[i][target] = students[i][compare];
                        students[i][compare] = targetStudent;
                        answer[i]++;
                        target = compare;
                    } else{
                        break;
                    }
                }
            }
            sb.append(i+1).append(" ").append(answer[i]).append("\n");
        }
        System.out.println(sb);
    }
}