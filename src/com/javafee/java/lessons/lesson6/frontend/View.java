package com.javafee.java.lessons.lesson6.frontend;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public String getInputString(String message) {
        System.out.println(message);
        return scanner.next();
    }
    public double getInputDouble(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }

    public Integer getInputInteger(String messsage) {
        System.out.println(messsage);
        return scanner.nextInt(); //TODO: zwraca Integer pobrany od użytkownika
    }

    public void printMessage(String message) {
        System.out.println(message);
        //TODO: metoda wyświetlająca komunikam message przekazany przez użytkownika na ekranie konsoli
    }

    public void printError(String message) {
        System.err.println(message);
    }
}
