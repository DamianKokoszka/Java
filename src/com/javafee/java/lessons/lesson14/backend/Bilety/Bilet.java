package com.javafee.java.lessons.lesson14.backend.Bilety;

public class Bilet {
    protected double cena = 40;
    protected int biletIDnumer;

    private static int NEXT_TICKET_ID_NUMBER = 0;

    public Bilet(){
        biletIDnumer = NEXT_TICKET_ID_NUMBER;
        NEXT_TICKET_ID_NUMBER++;
    }
    public double getCena(){
        return cena;
    }

    public String toString(){
        return String.format("Szczegoly Biletu: \nBiletID = %d\nCena: zl%.2f\n", this.biletIDnumer, this.getCena());
    }

    public void setBiletIDnumer(int biletIDnumer) {
        this.biletIDnumer = biletIDnumer;
    }

    public int getBiletIDnumer() {
        return biletIDnumer;
    }
}
