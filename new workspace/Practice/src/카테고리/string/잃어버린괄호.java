package 카테고리.string;

import java.io.*;

public class 잃어버린괄호 {
    // 괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램
    // 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고
    // 수는 0으로 시작할 수 있다. 입력으로 주어지는 식의 길이는 50보다 작거나 같다.
    static BufferedReader br;
    static String ev;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        ev = br.readLine();

        // -를 기준으로 배열을 담음
        String[] evs = ev.split("-");

        for(int i=0;i<evs.length;i++){
            String[] plusEvs = evs[i].split("\\+");
            if(new String[] {evs[i]}.length != plusEvs.length){
                int temp=0;
                for(int j=0;j<plusEvs.length;j++)  temp += Integer.parseInt(plusEvs[j]);
                evs[i] = String.valueOf(temp);
            }
        }
        int sum = Integer.parseInt(evs[0]);
        for(int k=1;k<evs.length;k++){
            sum -= Integer.parseInt(evs[k]);
        }
        System.out.println(sum);
    }
}
