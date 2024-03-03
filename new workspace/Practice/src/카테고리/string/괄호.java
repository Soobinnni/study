package 카테고리.string;

import java.io.*;
import java.util.*;

public class 괄호 {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        for(int i=1;i<=tc;i++){
            String parenthesis = br.readLine();
            List<Character> stack = new ArrayList<>();

            for(int j=0;j<parenthesis.length();j++){
                char c = parenthesis.charAt(j);
                if(c==')' && !stack.isEmpty() && stack.get(stack.size()-1) =='(') {
                    stack.remove(stack.size()-1);
                } else {
                    stack.add(c);
                }
            }
            sb.append(stack.isEmpty()?"YES":"NO").append("\n");
        }
        System.out.println(sb);
    }
}
