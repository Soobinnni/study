package com.example.part2;

import java.util.Arrays;

public class GugudanEx {
    public static void main(String[] args) {
        for (int i = 2;i<10;i++){
            System.out.print(i+"단\t\t\t");
        }
        System.out.println();
        for(int i = 1;i<10;i++){
            for(int j = 2;j<10;j++){
                System.out.print(j+" * "+i+" = "+ (i*j)+ "\t");
            }
            System.out.println();
        }
    }
}
