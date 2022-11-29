package com.javafee.java.lessons.lesson14.backend;

import com.javafee.java.lessons.lesson12.backend.Akcje;
import com.javafee.java.lessons.lesson14.backend.Bilety.Bilet;
import com.javafee.java.lessons.lesson14.backend.Bilety.BiletRezerwacja;
import com.javafee.java.lessons.lesson14.fronted.View;
import com.javafee.java.lessons.lesson9.backend.Rezerwacje;

import java.util.ArrayList;

public class Controller {
    public View view = new View();
    public Bilet bilet = new Bilet();
    public Kino kino = new Kino();
    public Sala sala = new Sala();
    public BiletRezerwacja biletRezerwacja = new BiletRezerwacja();

    public void run() {
        String choice = "";
        do {
            choice = view.getInputString("Podaj wybor: ");
            switch (choice) {

                case "1" -> view.printMessage(bilet.toString());
                case "2" -> view.printMessage(biletRezerwacja.toString());
                case "3" -> view.printMessage(kino.toString());
                //case "4" -> view.printMessage(); Uruchomienie kina (Wybranie miejsca,filmu,godziny,daty)//Rezerwacja
                //case "5" -> view.printMessage(); Uruchomienie kina (Lista filmow,Lista Biletow, Miejsca,Sala)
                case "4" -> performActionForAdd();
                default -> {
                    if (!"5".equals(choice)) view.printError("Nieprawidlowy wybor");
                }
            }
        } while (!choice.equals("5"));
    }
    private void performActionForAdd() {
        String choice = "";
        ArrayList<Rezerwacje> film = new ArrayList<>();
        while (true) {
            choice = view.getInputString("Dodaj film:");
            Rezerwacje r = new Rezerwacje();
            r.setImie(choice);
            film.add(r);
            System.out.println("Dodano pomyslnie film");
            break;

    //Przykład
//    private void performActionForAdd() {
//        String choice = "";
//        ArrayList<Rezerwacje> film = new ArrayList<>();
//        while (true) {
//            choice = view.getInputString("Dodaj film:");
//            Rezerwacje r = new Rezerwacje();
//            r.setImie(choice);
//            film.add(r);
//            System.out.println("Dodano pomyslnie film");
//            break;
        }
    }
}
