package 카테고리.기하_직사각형과_삼각형;

import java.io.*;
import java.util.*;

public class 삼각형과세변_5073 {
/*    Equilateral :  세 변의 길이가 모두 같은 경우
    Isosceles : 두 변의 길이만 같은 경우
    Scalene : 세 변의 길이가 모두 다른 경우
    Invalid: 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
    */
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            st = new StringTokenizer(br.readLine());

            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());

            if(a==0&&b==0&&c==0) break;

            int[] nums={a,b,c};
            Arrays.sort(nums);

            String ans = "Isosceles";
            if(nums[2]>=nums[0]+nums[1]){
                ans = "Invalid";
            } else {
                if(a==b&&b==c&&c==a){
                    ans = "Equilateral";
                } else if(a!=b&&b!=c&&c!=a){
                    ans  = "Scalene";
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.println(sb);
    }
}
