package com.javafee.java.lessons.lesson9.fronted;

import com.javafee.java.lessons.lesson9.backend.Hotel;
import com.javafee.java.lessons.lesson9.backend.HotelInformacje;
import com.javafee.java.lessons.lesson9.backend.Rezerwacje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private View view = new View();
    private Hotel hotel = new Hotel();
    private HotelInformacje hotelInformacje = new HotelInformacje();

    public void run() {
        String choice = "";
        do {
            System.out.println(hotelInformacje);
            choice = view.getInputString("Podaj wybór: ");
            switch (choice) {
                case "1" -> hotelInformacje.printRezerwacje();
                case "2" -> hotelInformacje.printAnulowanieRezerwacji();
                case "3" -> hotelInformacje.RezerwacjaPokoju();
                case "4" -> performActionForAdd();
                default -> {
                    if (!"5".equals(choice)) view.printError("Nieprawidłowy wybor");

                }
            }
        }
        while (!choice.equals("5"));
    }

    private void performActionForAdd() {
        String choice = "";
        ArrayList<Rezerwacje> pokoj = new ArrayList<>();
        while (true) {
            choice = view.getInputString("Dodaj pokoj:");
            System.out.println("Dodano pomyslnie pokoj");
            break;
        }
    }
}