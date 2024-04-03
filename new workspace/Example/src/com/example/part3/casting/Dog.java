package com.example.part3.casting;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("개처럼 먹다");
    }

    public void bark(){
        System.out.println("멍!");
    }
}


