package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {
    // 1. 점수 중 최댓값==M을 구한다.
    // 2. 모든 점수를 (원점수) / (M * 100)으로 고친다.
    // 3. 조작한 점수의 평균을 구한다.
    static BufferedReader br;
    static StringTokenizer st;

    static int N;
    static float max;
    static float[] scores;

    public static void main(String[] args)throws IOException {
        input();
        float sum = 0;
        for(int j=0;j<N;j++){
            sum += manipulateScore(scores[j]);
        }
        System.out.println(sum/(float)N);
        br.close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        scores = new float[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0;i<N;i++){
            float score = Float.parseFloat(st.nextToken());
            scores[i] = score;
            if(score>max) max = score;
        }
    }
    static float manipulateScore(float score){
        return score / max * 100;
    }
}
