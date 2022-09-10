package com.javafee.java.lessons.lesson4;

public class Bank {
    private Konto[] konta = new Konto[100];
    private int liczbaKont = 0;
    public void dodajKonto(Konto konto){
        this.konta[liczbaKont] = konto;
        liczbaKont++;
    }
    public Konto szukajKonta(int numer){
        if(numer<0|| numer >= liczbaKont){
            System.out.println("Zły numer konta");
        }

        for(Konto konto : konta) {
            if(konto.getNumerKonta() == numer)
                return konto;
        }
        return konta[numer];
    }
}
