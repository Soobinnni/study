package 카테고리.약수_배수와소수;

import java.io.*;

public class 약수들의합_9506 {
    static BufferedReader br;
    static StringBuilder sb=new StringBuilder();


    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N==-1) break;

            StringBuilder temp=new StringBuilder();
            int hab = 1;
            temp.append(String.format("%d = 1", N));
            for(int i=2;i<(N/2)+1;i++){
                if(N%i==0){
                    hab+=i;
                    temp.append(String.format(" + %d", i));
                }
            }
            if(N == hab){
                sb.append(temp).append("\n");
            } else{
                sb.append(String.format("%d is NOT perfect.\n", N));
            }
        }
        System.out.println(sb);
    }
}
