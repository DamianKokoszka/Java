package com.javafee.java.lessons.lesson7.frontend;

import com.javafee.java.lessons.lesson7.backend.CarDealer;
import com.javafee.java.lessons.lesson7.backend.CarList;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private View view = new View();
    private CarDealer cardealer = new CarDealer();

    public void run(){
        view.printMessage("Witaj w salonie");
        String choice = "";
        do{
            view.printMessage("Co chcesz zrobić?\n1 - dodać samochod do zamówienia,\n2 - zamówić samochod,\n3 - lista samochodow,\n4 - wyjść z programu\"");
            choice = view.getInputString("Podaj wybór: ");
            switch (choice){
                case "1" ->performActionForAdd();
                case "2" -> performActionForOrder();
                case "3" -> performActionForCar();
                    default -> {
                        if(!"4".equals(choice)) view.printError("Nieprawidłowy wybór");
                    }
            }
        } while (!choice.equals("4"));
    }

    private void performActionForAdd(){
        cardealer.addToMenu(view.getInputString("Podaj nazwe samochodu: "), view.getInputDouble("Podaj cene samochodu:"));
    }
    private void performActionForOrder(){
        String choice = "";
        List<String> carName = new ArrayList<>();
        while (true){
            choice = view.getInputString("Podaj nazwę lub q");
            // create order (client, car)
            cardealer.addToMenu(view.getInputString("Podaj nazwe samochodu: "), view.getInputDouble("Podaj cene samochodu:"));
            if(!choice.equals("q"))
                carName.add(choice);
            else break;
        }
    }
    private void performActionForCar(){
       cardealer.getCarList().print();
    }
}
