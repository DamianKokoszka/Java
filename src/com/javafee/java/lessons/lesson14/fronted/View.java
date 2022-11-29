package com.javafee.java.lessons.lesson14.fronted;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printError(String message){
        System.err.println(message);
    }

    public String getInputString(String message){
        System.out.println(message);
        return scanner.next();
    }
}
