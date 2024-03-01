package 카테고리.기하_직사각형과_삼각형;

import java.io.*;

public class 삼각형외우기_10101 {
    static BufferedReader br;
/*
    세 각의 크기가 모두 60이면, Equilateral
    세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
    세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
    세 각의 합이 180이 아닌 경우에는 Error
*/
    public static void main(String[] args) throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        if(a==60&&b==60&c==60) {
            System.out.println("Equilateral");
        } else{
            int hab = a+b+c;
            if(hab!=180){
                System.out.println("Error");
            } else if(hab==180 && a!=b && b!=c && c!=a){
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}