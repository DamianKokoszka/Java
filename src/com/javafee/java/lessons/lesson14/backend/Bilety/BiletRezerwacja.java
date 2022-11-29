package com.javafee.java.lessons.lesson14.backend.Bilety;

public class BiletRezerwacja {
    private int idrezerwacje;
    private int seans_idseans;
    private int klient_idklient;

    public int getIdrezerwacje() {
        return idrezerwacje;
    }

    public void setIdrezerwacje(int idrezerwacje) {
        this.idrezerwacje = idrezerwacje;
    }

    public int getSeans_idseans() {
        return seans_idseans;
    }

    public void setSeans_idseans(int seans_idseans) {
        this.seans_idseans = seans_idseans;
    }

    public int getKlient_idklient() {
        return klient_idklient;
    }

    public void setKlient_idklient(int klient_idklient) {
        this.klient_idklient = klient_idklient;
    }
    public BiletRezerwacja(){
        super();
    }
    public BiletRezerwacja(int seans_idseans, int klient_idklient){
        super();
        this.seans_idseans = seans_idseans;
        this.klient_idklient = klient_idklient;
    }

    public BiletRezerwacja(int idrezerwacje, int seans_idseans,int klient_idklient){
        super();
        this.idrezerwacje = idrezerwacje;
        this.seans_idseans = seans_idseans;
        this.klient_idklient = klient_idklient;
    }

    @Override
    public String toString() {
        return  "Rezerwacje [idrezerwacje= " + idrezerwacje + " seans_idseans= " + seans_idseans + " klient_idklient= " + klient_idklient +"]";
    }
}
