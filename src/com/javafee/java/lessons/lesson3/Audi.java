package com.javafee.java.lessons.lesson3;

public class Audi extends Samochod {
    private String marka;
    private int rokProdukcji = 2022;
    private double cena;
    private double rabat = 10;

    @Override
    public int getRokProdukcji() {
        return rokProdukcji;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    @Override
    public double getCena() {
        return cena;
    }
    public double cenaPoRabacie(double rabat){
        return getCena() - (getCena() * (rabat / 100));
    }

    public void setCena(int cena){
        this.cena = cena;
    }
}
