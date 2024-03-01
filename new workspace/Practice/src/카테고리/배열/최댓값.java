package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static int answerNum, answerOrder;

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
        br.close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        answerNum = 0;
        for(int i=0;i<9;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>answerNum){
                answerNum = num;
                answerOrder = i+1;
            }
        }
        sb.append(answerNum).append("\n").append(answerOrder);
    }
}
