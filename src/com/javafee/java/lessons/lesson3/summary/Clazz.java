package com.javafee.java.lessons.lesson3.summary;

public class Clazz {
    private Integer filed; // pole (modyfikator dostepu private)

    public Clazz() {
        System.out.printf("Konstuktor"); // konstruktor - nazywa sie jak klasa i nie ma typu zwracanego
    }

    public void met1() {
        System.out.printf("met1 nic nie zwraca i nie przyjmuje");
    }

    public double met2() {
        System.out.println("met2 zwraca i nie przyjmuje");
        return 2.0;
    }

    public double met3(String arg1, String arg2, int arg3) {
        System.out.println("met3 zwraca i przyjmuje, arg: " + arg1 + " " + arg2 + " " + arg3);
        return 3.0;
    }
}
