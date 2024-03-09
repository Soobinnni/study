package 강의._3_배열;

import java.io.*;
public class 수정렬하기_10989 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 카운트배열 사용
        int[] nums = new int[10001];
        for(int i=0;i<N;i++) nums[Integer.parseInt(br.readLine())]++;
        br.close();

        for(int i=1;i<=10000;i++){
//            if(nums[i]>0){
//                for(int j=0;j<nums[i];j++) sb.append(i).append("\n");
//            }
            while(nums[i]-- >0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
