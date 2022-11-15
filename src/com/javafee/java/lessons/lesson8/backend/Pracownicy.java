package com.javafee.java.lessons.lesson8.backend;

public class Pracownicy {
    public String imie;
    public String nazwisko;
    public String plec;
    public int wiek;
    public boolean zyje;

    public Pracownicy(){
        this.zyje = true;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setZyje(boolean zyje) {
        this.zyje = zyje;
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

    public String getPlec() {
        return plec;
    }

    public boolean isZyje() {
        return zyje;
    }
}
