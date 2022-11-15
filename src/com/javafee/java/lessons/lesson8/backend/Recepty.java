package com.javafee.java.lessons.lesson8.backend;

public class Recepty {
    private int id;
    private String imie;
    private String nazwisko;
    private int wiek;

    public void setId(int id){
        this.id = id;
    }
    public void setImie(String imie){
        this.imie = imie;

    }
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;

    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getId() {
        return id;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
