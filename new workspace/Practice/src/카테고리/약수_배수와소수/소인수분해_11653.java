package 카테고리.약수_배수와소수;

import java.io.*;

public class 소인수분해_11653 {
    // "에라토스테네스의 체" 알고리즘
    // i * i <= N인 이유는 :최적화: i보다 작은 수는 이미 이전에 i의 배수로 지워졌으므로 확인할 필요 X
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int divid = 2;
        if(N==1) {
            return;
        } else{
            while(N>1){
                if(N%divid==0){
                    N /= divid;
                    sb.append(divid).append("\n");
                } else {
                    divid++;
                }
            }
        }
        System.out.println(sb);
    }
    static void 남의풀이() throws Exception{
        int n = Integer.parseInt(br.readLine());

        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                sb.append(i).append("\n");
                n /= i;
            }
        }
        if(n!=1) sb.append(n);

        System.out.println(sb);
    }
}