package 강의._4_완전탐색과시뮬레이션;

import java.io.*;
public class 사탕게임_3085 {
    static BufferedReader br;
    static int N;
    static char candy[][];

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        N = nextInt(br);
        candy = new char[N][N];
//        char[] candyR = new char[N];
//        char[] candyD = new char[N];

        // 배열 초기화
//        int d=0;
//        int r=0;
        for(int i=0;i<N;i++){
            String str = br.readLine();
            for(int j=0;j<N;j++){
                char c=str.charAt(j);
                candy[i][j] = c;

//                if(j==0) candyR[r++]=c;
//                if(i==0) candyD[d++] = c;
            }
        }


        int max=candyCount();
        // 열과 행 조사.
        // 아래쪽과 다른지 검사(열끼리)
        for(int i=0;i<N;i++){
//            char lastCandyR = candyR[i];
//            char lastCandyD = candyD[i];

            for(int j=0;j<N;j++){
//                char compareCandyR = candy[i][j];
//                char compareCandyD = candy[j][i];

                if((j+1 < N) && candy[i][j]!=candy[i][j+1]) {
                    swapCandy(i,j, i, j+1);
                    int count=candyCount();
                    swapCandy(i,j, i, j+1);

                    max = Math.max(count, max);
                }

                if((j+1 < N) && candy[j][i]!=candy[j+1][i]) {
                    swapCandy(j,i, j+1, i);
                    int count=candyCount();
                    swapCandy(j,i, j+1, i);
                    max = Math.max(count, max);
                }
            }
        }

        System.out.println(max);
    }
    static int candyCount(){
        int a=countCandyR();
        int b=countCandyD();
        return Math.max(a,b);
    }
    static void swapCandy(int r, int c, int swapR, int swapC){
        char temp = candy[r][c];
        candy[r][c]=candy[swapR][swapC];
        candy[swapR][swapC]=temp;
    }
//    static void switchCandyLeft(int r, int c){
//        char temp = candy[r][c];
//        candy[r][c]=candy[r][c-1];
//        candy[r][c-1]=temp;
//    }
//    static void switchCandyAbove(int r, int c){
//        char temp = candy[r][c];
//        candy[r][c]=candy[r-1][c];
//        candy[r-1][c]=temp;
//    }
    static int countCandyD(){
        int max=0;
        for(int i=0;i<N;i++){
            int count=1;
            for(int j=0;j<N-1;j++){
                count++;
                if(candy[i][j]!=candy[i][j+1]) {
                    count=1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
    static int countCandyR(){
        int max=0;
        for(int i=0;i<N;i++){
            int count=1;
            for(int j=0;j<N-1;j++){
                count++;
                if(candy[j][i]!=candy[j+1][i]) {
                    count=1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
    static int nextInt(BufferedReader br) throws Exception{
        int n =0;
        while(true){
            int input = br.read();
            if('0'<=input && input<='9'){
                n = (n<<3) + (n<<1) + (input&15);
            } else return n;
        }
    }
}