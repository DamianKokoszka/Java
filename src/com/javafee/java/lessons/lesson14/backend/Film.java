package com.javafee.java.lessons.lesson14.backend;

public class Film {
    private String title;
    private int rokProd;
    private String czas_trwania;
    private String gatunek;

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRokProd(){
        return rokProd;
    }

    public void setRokProd(int rokProd) {
        this.rokProd = rokProd;
    }

    public String getCzas_trwania() {
        return czas_trwania;
    }
    public void setCzas_trwania(String czas_trwania){
        this.czas_trwania = czas_trwania;
    }
    public String getGatunek(){
        return gatunek;
    }
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }
    public Film(){
    }
    public Film(String title, int rokProd, String czas_trwania,String gatunek){
        this.title = title;
        this.rokProd = rokProd;
        this.czas_trwania = czas_trwania;
        this.gatunek = gatunek;
    }
}
