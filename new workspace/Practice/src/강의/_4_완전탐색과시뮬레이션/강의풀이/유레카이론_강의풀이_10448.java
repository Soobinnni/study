package 강의._4_완전탐색과시뮬레이션.강의풀이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 유레카이론_강의풀이_10448 {
    // 전처리를 한다.
    // 1. k의 범주가 1000이므로, 44의 삼각수가 1000이하의 최대 삼각수이므로 44개의 삼각수를 구한다.
    // 2. 주어진 수가 3개의 삼각수의 합으로 완성될 수 있는지 1001크기의 배열에 boolean값을 채운다.

    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static boolean isEurekaNumber[];

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        int N=nextInt(br);
        preprocess();
        while(N-->0){
            int k = nextInt(br);
            sb.append(isEurekaNumber[k]?1:0).append("\n");
        }
        System.out.println(sb);
    }
    static void preprocess(){
        // 삼각수 44까지 구하기. triangleNumberCount로 k의 범주까지의 삼각수의 수를 찾을 수 있음.
        int[] triangleNumbers = new int[45];
        int triangleNumberCount = 0;
        int kRange = 1000;
        for(int i=1;;i++){
            int result = i * (i + 1) / 2;
            if(result>kRange) break;
            triangleNumbers[1+triangleNumberCount++]=result;
        }

        // k의 범위인 1000까지 검사
        isEurekaNumber = new boolean[1001];

        for (int i=1;i<triangleNumberCount;i++){
            for (int j=1;j<triangleNumberCount;j++){
                for (int l=1;l<triangleNumberCount;l++){
                    int eurakaNum = triangleNumbers[i] + triangleNumbers[j] + triangleNumbers[l];
                    if(eurakaNum>1000) break;
                    isEurekaNumber[eurakaNum]=true;
                }

            }

        }
    }

    static int nextInt(BufferedReader br) throws Exception{
        int n=0;
        while(true){
            int input = br.read();
            if('0'<=input && input<='9'){
                n = (n<<3)+(n<<1)+(input&15);
            } else return n;
        }
    }
}
