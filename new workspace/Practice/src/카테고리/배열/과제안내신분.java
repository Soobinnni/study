package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 과제안내신분 {
    static BufferedReader br;
    static int[] students = new int[30];

    public static void main(String[] args)throws IOException {
        input();
        for(int i=0;i<30;i++){
            if (students[i]==0) System.out.println(i+1);
        }
        br.close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<28;i++){
            int student = Integer.parseInt(br.readLine());
            students[student-1] = 1;
        }
    }
}
