package com.javafee.java.lessons.lesson3;

public class Ford extends Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena = 25000;
    private double rabat = 7;

    @Override
    public double getCena() {
        return cena;
    }
    public double cenaPoRabacie(double rabat){
        return cena - (cena * (rabat / 100));
    }
    public void setCena(int cena){
        this.cena = cena;
    }
}
