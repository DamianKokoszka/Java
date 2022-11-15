package com.javafee.java.lessons.lesson9.backend;

import java.util.ArrayList;

public class Rezerwacje {
    private ArrayList<Rezerwacje> pokoj;
    private String imie;
    private int PokojNumer;
    public Rezerwacje(){

    }

    public Rezerwacje(String osoba){
        imie = osoba;
    }
    public Rezerwacje(String osoba, int pokoj){
        imie = osoba;
        PokojNumer = pokoj;
    }
    public void setPokoj(int nowypokoj){
        PokojNumer = nowypokoj;
    }

    public void setImie(String noweimie) {
        imie = noweimie;
    }
    public String toString(){
        return (imie + "  " + PokojNumer);
    }
    public int getPokoj(){
        return PokojNumer;
    }
    public String getImie(){
        return imie;
    }
}
