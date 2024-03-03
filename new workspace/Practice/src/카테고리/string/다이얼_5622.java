package 카테고리.string;

import java.io.*;

public class 다이얼_5622 {
    static BufferedReader br;

    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int getNum = getAlphabetNum((int)str.charAt(i));
            sum+=(getNum+1);
        }
        System.out.println(sum);
    }
    static int getAlphabetNum(int alphabet){
        if(alphabet>=87){
            return 9;
        } else if(alphabet>=84){
            return 8;
        }   else if(alphabet>=80){
            return 7;
        } else if(alphabet>=77){
            return 6;
        } else if(alphabet>=74){
            return 5;
        }else if(alphabet>=71){
            return 4;
        } else if(alphabet>=68){
            return 3;
        } else{
            return 2;
        }
    }
}
