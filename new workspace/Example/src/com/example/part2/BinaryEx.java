package com.example.part2;

public class BinaryEx {
    public static void main(String[] args){
        // ex 126을 각각 십진수, 이진수, 팔진수, 십육진수로 나타내기
        // Integer의 메서드를 이용한다.
        int num = 126;

        String binaryToString = Integer.toBinaryString(num);
        System.out.println("binary = " + binaryToString); // binary = 1111110

        String octalToString = Integer.toOctalString(num);
        System.out.println("octal = " + octalToString); // octal = 176

        String hexaToString = Integer.toHexString(num);
        System.out.println("hexa = " + hexaToString); // hexs = 7e

        int binary = 0b1111110;
        int octal = 0176;
        int hexa = 0x7e;

        // 모두 126으로 출력.
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexa);
    }
}
