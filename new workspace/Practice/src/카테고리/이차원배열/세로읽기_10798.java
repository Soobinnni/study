package 카테고리.이차원배열;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 세로읽기_10798 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = new String[5];
        for(int i=0;i<5;i++) strs[i] = br.readLine();

        for(int i=0;i<15;i++){
            for (int j=0;j<5;j++){
                String s = strs[j];
                if(s.length()>i){
                    sb.append(s.charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
