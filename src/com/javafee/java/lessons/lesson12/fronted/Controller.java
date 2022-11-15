package com.javafee.java.lessons.lesson12.fronted;

import com.javafee.java.lessons.lesson12.backend.Akcje;
import com.javafee.java.lessons.lesson12.backend.Model;

public class Controller {
    private Akcje akcje = new Akcje();
    private Model m = new Model();
    private View v = new View();

    public void run() {
        String choice = "";
        do {
            System.out.println();
            choice = v.getInputString("Podaj wybor planszy: 1 - Latwy, 2 - Sredni, 3 - Trudny, 4 - Bardzo Trudny, 5 - Wybor gracza");
            switch (choice) {
                case "1" -> m.Latwy();
                case "2" -> m.Sredni();
                case "3" -> m.Trudny();
                case "4" -> m.BardzoTrudny();
                case "5" -> m.graczaWybor();
                case "6" -> m.Test();
                default -> {
                    if (!"7".equals(choice)) v.printError("Nieprawidlowy wymiar planszy");
                }
            }
        }
        while (!choice.equals("7"));
    }
}