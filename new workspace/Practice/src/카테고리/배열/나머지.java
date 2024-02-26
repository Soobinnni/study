package 카테고리.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 나머지 {
    static BufferedReader br;
    static Set<Integer> nums = new HashSet<>();

    public static void main(String[] args)throws IOException {
        input();
        System.out.println(nums.size());
        br.close();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            nums.add(Integer.parseInt(br.readLine())%42);
        }
    }
}
