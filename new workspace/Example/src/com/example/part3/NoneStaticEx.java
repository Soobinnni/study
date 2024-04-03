package com.example.part3;

public class NoneStaticEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        // static멤버가 아니라면 인스턴스 생성 후 접근해야 한다.
        NoneStaticEx ne = new NoneStaticEx();
        int sum = ne.hap(a, b);
    }

    public int hap(int a, int b) {
        int v = a + b;
        return v;
    }
}