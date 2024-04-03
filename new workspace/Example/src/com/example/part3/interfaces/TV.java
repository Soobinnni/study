package com.example.part3.interfaces;

public class TV implements Remocon{
    private int currch=10;
    @Override
    public void chUp() {
        currch++;
        if(currch>Remocon.MAXCH){
            currch=1;
        }
        System.out.println("TV채널이 올라감");
    }

    @Override
    public void chDown() {
        currch--;
        if(currch<Remocon.MINCH){
            currch=99;
        }
        System.out.println("TV채널이 내려감");
    }

    @Override
    public void volUp() {

    }

    @Override
    public void volDown() {

    }
}
