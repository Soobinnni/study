package 카테고리.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳찾기 {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        String str = br.readLine();

        int[] alphs = new int[26];
//        for(int i=0;i<26;i++) alphs[i]=-1;
        Arrays.fill(alphs,-1);

        for(int j=0;j<str.length();j++){
            if(alphs[str.charAt(j)-'a']!=-1) continue;
            alphs[str.charAt(j)-'a'] = j;
        }

        for(int k:alphs) System.out.print(k + " ");
    }
}
