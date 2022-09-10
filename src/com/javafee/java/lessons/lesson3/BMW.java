package com.javafee.java.lessons.lesson3;

public class BMW extends Samochod {
    private double rabat = 3;
    private double cena;

    public double cenaPoRabacie(double rabat) {
        return cena - (cena * (rabat / 100));
    }

    public double getRabat() {
        return rabat;
    }

    public void setRabat(double rabat) {
        this.rabat = rabat;
    }

    public void setCena(int cena){
        this.cena = cena;
    }
}
