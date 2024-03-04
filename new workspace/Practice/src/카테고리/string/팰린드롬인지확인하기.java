package 카테고리.string;

import java.io.*;

public class 팰린드롬인지확인하기 {
    static BufferedReader br;
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        int left = 0;
        int right = p.length()-1;
        int answer = 1;
        while(left<right){
            if(p.charAt(left)!=p.charAt(right)) {
                answer = 0;
                break;
            }
            left++;
            right--;
        }
        System.out.println(answer);
    }
}