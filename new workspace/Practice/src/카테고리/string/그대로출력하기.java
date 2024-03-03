package 카테고리.string;

import java.io.*;

public class 그대로출력하기 {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));

        String inputStr;
        while ((inputStr=br.readLine())!=null) {
//            if (inputStr.isEmpty() || inputStr == null) {
//                break;
//            }
            sb.append(inputStr).append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }

}
