package com.javafee.java.lessons.lesson3;

public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public void uruchom() {
        System.out.println("Bruummmm");
    }

    public void zmienBieg(String nazwa) {
        System.out.println("Zmien bieg na " + nazwa);
    }

    // typZwracany nazwa(argumenty) {
    //      // implementacja
    // }

    public String getMarka() {
        return marka;
    }

    public double getCena() {
        return cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
}

