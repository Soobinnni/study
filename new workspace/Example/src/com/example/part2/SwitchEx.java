package com.example.part2;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        switch (input.nextLine()){
            case "Monday":
                answer = "야구하기";
                break;
            case "Tuesday": // cascade -> 수영하기
            case "Wednesday":
                answer = "수영하기";
                break;
            default:
                answer = "휴식";
        }

        System.out.println(answer);
    }
}
