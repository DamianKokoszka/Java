package com.javafee.java.lessons.lesson8.backend;

public class Pacjent extends Recepty {
    public String imie;
    public String nazwisko;
    public String plec;
    public int wiek;

    public boolean jestChory;
    public int liczbaDniWSzpitalu;


    public Pacjent(){
        this.jestChory = true;
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

    public void setJestChory(boolean jestChory) {
        this.jestChory = jestChory;
    }

    public void setLiczbaDniWSzpitalu(int liczbaDniWSzpitalu) {
        this.liczbaDniWSzpitalu = liczbaDniWSzpitalu;
    }

    public int getLiczbaDniWSzpitalu() {
        return liczbaDniWSzpitalu;
    }

    public boolean isJestChory() {
        return jestChory;
    }
}
