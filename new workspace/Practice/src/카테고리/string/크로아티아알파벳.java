package 카테고리.string;

import java.io.*;

public class 크로아티아알파벳 {
    static BufferedReader br;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        String[] croAlph = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String c:croAlph){
            inputStr = inputStr.replace(c, "0");
        }
        System.out.println(inputStr.length());
    }
}
