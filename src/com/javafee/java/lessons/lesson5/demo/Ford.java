package com.javafee.java.lessons.lesson5.demo;

import com.javafee.java.lessons.lesson3.Samochod;

public class Ford extends Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena = 25000;
    private double rabat = 7;

    @Override
    public double getCena() {
        return cena;
    }

    public double cenaPoRabacie(double rabat) {
        return cena - (cena * (rabat / 100));
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return "marka: " + marka + ", rok: " + rokProdukcji + " r.";
    }
}
