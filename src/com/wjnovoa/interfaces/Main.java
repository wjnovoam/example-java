package com.wjnovoa.interfaces;

public class Main {
    public static void main(String[] args) {
        EnglishLanguage english = new EnglishLanguage();
        ProgrammingLang pl = new ProgrammingLang();

        english.sayhi();
        pl.sayhi();
        pl.sayBye();
        english.sayBye();

    }
}
