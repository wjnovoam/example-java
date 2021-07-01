package com.wjnovoa.interfaces;

public class EnglishLanguage implements Lenguage{

    @Override
    public void sayhi() {
        System.out.println("Hi from English");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye from English");
    }
}
