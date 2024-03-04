package 카테고리.string;

import java.util.Scanner;

public class 소금폭탄 {
    static Scanner sc=new Scanner(System.in);
    static int currT, inputT;
    public static void main(String[] args) {
        input();
        String answer = "";
        int needT = inputT-currT;
        if(needT <= 0) answer = getTime(needT + 24 * 60 * 60);
        else answer = getTime(needT);
        System.out.println(answer);
    }
    static void input(){
        currT = convertSec();
        inputT = convertSec();
    }
    static int convertSec(){
        String[] times = sc.next().split(":");
        int time = (Integer.parseInt(times[0]) * 60 * 60) + (Integer.parseInt(times[1]) * 60) + Integer.parseInt(times[2]);
        return time;
    }
    static String getTime(int time){
        int hour = time / (60*60);
        int minute = (time % (60*60)) / 60;
        int second = time % 60;
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
