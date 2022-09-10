package com.javafee.java.lessons.lesson4;

public class Main {
    public static void main(String args[]){
        Konto konto1 = new Konto(50000);
        Konto konto2 = new Konto(32000);

        Bank bank = new Bank();
        bank.dodajKonto(konto1);
        bank.dodajKonto(konto2);
    }
}
