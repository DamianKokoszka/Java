package com.javafee.java.lessons.lesson9.backend;

public class Klient {
    private String imie;
    private String nazwisko;
    public Klient(){

    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }
}
