package 카테고리.약수_배수와소수;

import java.io.*;

public class 소수_2581 {
    static BufferedReader br;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int min = 0;
        boolean isMin = true;
        for (int i = M; i <= N; i++) {
            if (i == 1) continue;
            else {
                int cnt = 1;
                for (int j = 2; j <= N; j++) {
                    if (i % j == 0) {
                        cnt++;
                    }
                    if (cnt > 2) {
                        break;
                    }
                }

                if (cnt == 2) {
                    result += i;
                    if (isMin) {
                        min = i;
                        isMin = false;
                    }
                }
            }
        }
        if(result>0){
            System.out.println(result+"\n"+min);
        }else{
            System.out.println(-1);
        }
    }
}
