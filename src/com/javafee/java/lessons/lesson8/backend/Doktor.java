package com.javafee.java.lessons.lesson8.backend;

public class Doktor {
    public String imie;
    public String nazwisko;
    private int wiek;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }
    public boolean jestCertyfikowany;

    public Doktor(){
        this.jestCertyfikowany = false;
    }
}
