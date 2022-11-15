package com.javafee.java.lessons.lesson9.backend;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelInformacje {

    private Klient klient = new Klient();
    private Hotel hotel = new Hotel();
    private Rezerwacje rezerwacje = new Rezerwacje();
    private Pokoj pokoj = new Pokoj();
    String osoba;
    String num;
    int numPokoj;

    public void printRezerwacje() {
        System.out.println("Imie:" + klient.getImie());
        System.out.println("Pokoj:" + rezerwacje.getPokoj());
        System.out.print(pokoj.toString());
    }

    public void printAnulowanieRezerwacji() {
        System.out.println("Imie:" + klient.getImie());
        System.out.println("Pokoj:" + rezerwacje.getPokoj());
    }
    public void RezerwacjaPokoju(){
        System.out.println("Imie:" + hotel.rezerwacjeObj);
        System.out.println("Pokoj:" + hotel.RezerwacjaPokoju(osoba));
    }

    @Override
    public String toString() {
        return "HotelInformacje {" + "hotel:" + hotel + ", rezerwacje:" + rezerwacje + ", pokoj:" + pokoj + ", osoba:'" + osoba + ", num:'" + num  + ", numPokoj:" + numPokoj + "}".formatted(hotel, rezerwacje, pokoj);
    }
}
