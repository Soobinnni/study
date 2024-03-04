package 카테고리.string;

import java.io.*;

public class 소트인사이드 {
    static BufferedReader br;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        int[] numsCount = new int[10];
        for(int i=0;i<nums.length();i++){
            char num = nums.charAt(i);
            numsCount[num-'0']++;
        }

        sb = new StringBuilder();
        for(int j=9;j>=0;j--){
            if(numsCount[j]==0) continue;
            for (int k=0;k<numsCount[j];k++) sb.append(j);
        }
        System.out.println(sb);
    }
}