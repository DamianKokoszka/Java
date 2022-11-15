package com.javafee.java.lessons.lesson10.backend;

public class BiletParkingowy {
    public String wprowadzdate;
    public String wprowadzgodzine;
    public long NumerKarty;
    public String TypKarty;
    public int NumerMiejsca;
    public Samochod samochod;

    public Samochod getPrzypisanieSamochodu(){
        return samochod;
    }
    public void setPrzypisanieSamochodu(Samochod samochod){
        this.samochod = samochod;
    }
    public String getData(){
        return wprowadzdate;
    }
    public void setData(String wprowadzdate){
        this.wprowadzdate = wprowadzdate;
    }
    public String getCzas(){
        return wprowadzgodzine;
    }
    public void setCzas(String wprowadzgodzine){
        this.wprowadzgodzine = wprowadzgodzine;
    }
    public long getNumerKarty(){
        return NumerKarty;
    }

    public void setNumerKarty(long NumerKarty) {
        this.NumerKarty = NumerKarty;
    }

    public String getTypKarty() {
        return TypKarty;
    }
    public void setTypKarty(String TypKarty){
        this.TypKarty = TypKarty;
    }
    public int getNumerMiejsca(){
        return NumerMiejsca;
    }
    public void setNumerMiejsca(int numerMiejsca){
        this.NumerMiejsca = numerMiejsca;
    }
}
