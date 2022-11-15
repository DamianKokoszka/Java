package com.javafee.java.lessons.lesson8.fronted;


import com.javafee.java.lessons.lesson8.backend.Pacjent;
import com.javafee.java.lessons.lesson8.backend.Szpital;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Controller {
    private View view = new View();
    private Szpital szpital = new Szpital();

    public void run() {
        System.out.println(szpital);
        String choice = "";
        do {
            System.out.println(szpital);
            choice = view.getInputString("Podaj wybór: ");
            switch (choice) {
                case "1" -> szpital.printSzpitalInformacje();
                case "2" -> szpital.printDoktorInformacje();
                case "3" -> szpital.printPacjentInformacje();
                case "4" -> performActionForAdd();
                default -> {
                    if (!"5".equals(choice)) view.printError("Nieprawidłowy wybór");
                }
            }
        }
        while (!choice.equals("5"));
    }

    private void performActionForAdd() {
        String choice = "";
        List<String> Pacjent = new ArrayList<>();
        while (true) {
            szpital.addToPacjent(view.getInputString("Podaj nazwisko pacjenta do dodania: "));
            szpital.removeToPacjent(view.getInputString("Podaj nazwisko pacjenta do usuniecia: "));
            szpital.addToDoktor(view.getInputString("Podaj nazwisko doktora do dodania: "));
            szpital.removeToDoktor(view.getInputString("Podaj nazwisko doktora do usuniecia:: "));
            break;
        }
    }


}
