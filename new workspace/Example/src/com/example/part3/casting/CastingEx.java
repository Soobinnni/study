package com.example.part3.casting;

public class CastingEx {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();

        System.out.println(ani instanceof Animal);
        System.out.println(ani instanceof Cat);
    }
}
