package com.javafee.java.lessons.lesson9.backend;

import java.util.ArrayList;

public class Pokoj {
    private ArrayList<Pokoj> pokoj;
    public boolean widokZOkna = true;
    public boolean bliskoPlazy = false;
    public boolean Wyposarzenie = true;

    public Pokoj(){

    }
    public Pokoj(ArrayList<Pokoj> pokoj, boolean widokZOkna, boolean bliskoPlazy, boolean wyposarzenie) {
        this.pokoj = pokoj;
        this.widokZOkna = widokZOkna;
        this.bliskoPlazy = bliskoPlazy;
        Wyposarzenie = wyposarzenie;
    }

    public boolean isBliskoPlazy() {
        return bliskoPlazy;
    }

    public boolean isWidokZOkna() {
        return widokZOkna;
    }

    public boolean isWyposarzenie() {
        return Wyposarzenie;
    }

    public ArrayList<Pokoj> getPokoj() {
        return pokoj;
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "pokoj:" + pokoj +
                ", widokZOkna:" + widokZOkna +
                ", bliskoPlazy:" + bliskoPlazy +
                ", Wyposarzenie:" + Wyposarzenie +
                '}';
    }

}
