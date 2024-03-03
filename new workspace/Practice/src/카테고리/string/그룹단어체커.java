package 카테고리.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 그룹단어체커 {
    static BufferedReader br;
    static StringBuilder sb;
    static int count = 0;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for(int i=1;i<=tc;i++){
            String str = br.readLine();
            boolean[] apb = new boolean[26];
            boolean duplicate = false;

            apb[str.charAt(0)-'a'] = true;
            for(int j = 1;j<str.length();j++){
                char checkWord = str.charAt(j);
                if(str.charAt(j-1)!=checkWord && apb[checkWord-'a']) {
                    duplicate=true;
                    break;
                }
                apb[checkWord-'a'] = true;
            }
            if(!duplicate) count++;
        }
        System.out.println(count);
    }
}
