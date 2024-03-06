package 난이도.two;

import java.io.*;
import java.util.*;

public class 가장긴증가하는부분수열_11053 {
    static BufferedReader br;
    static StringTokenizer st;
    static int N, max, count, nums[];
    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
//        max = 1;
        st = new StringTokenizer(br.readLine());
        nums = new int[N];
        for(int i=0;i<N;i++) nums[i] = Integer.parseInt(st.nextToken());
//
//        nums = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        countArr(1, nums[0]);
//        System.out.println(max);
        lengthOfLIS();
        System.out.println(max+" "+count);
    }

    public static void lengthOfLIS() {
        int[] dp = new int[N];
        Arrays.fill(dp,1);
        max = 1;
        count=0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                count++;
            }
            max = Math.max(max, dp[i]);
        }
    }
    static void countArr(int index, int standardValue){
        int lastValue = standardValue;
        int count = 1;

        for(int i=index;i<N;i++){
            int checkValue = nums[i];
            if(lastValue==checkValue || lastValue > checkValue) {
                lastValue=checkValue;
                continue;
            }
            if(lastValue < checkValue){
                // 증가하는 수열
                count++;
            }
            if(standardValue > checkValue){
                // 기준 값보다 작은 값이 나옴
                countArr(i, checkValue);
            }

            lastValue=checkValue;
        }
        max = max<count?count:max;
    }
}
