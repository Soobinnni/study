package 카테고리.기하_직사각형과_삼각형;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대지_9063 {
    static BufferedReader br;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        if(N==1) {
            System.out.println(0);
            return;
        } else{
            int minX=10001;
            int maxX=-10001;
            int minY=10001;
            int maxY=-10001;

            for (int i = 0; i < N; i++) {
                st=new StringTokenizer(br.readLine());
                int a=Integer.parseInt(st.nextToken());
                int b=Integer.parseInt(st.nextToken());
                if(minX>a) minX=a;
                if(maxX<a) maxX=a;
                if(minY>b) minY=b;
                if(maxY<b) maxY=b;
            }

            System.out.println((maxX-minX) * (maxY-minY));
        }
    }
}
