package com.javafee.java.lessons.lesson9.fronted;

import java.util.Scanner;

public class View {
public Scanner scanner = new Scanner(System.in);
    public void printKomenda(String message){
        System.err.println(message);
    }
    public void printError(String message){
        System.err.println(message);
    }

    public String getInputString(String message) {
        System.out.println(message);
        return scanner.next();
    }
    public double getInputDouble(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }
    public Integer getInputInteger(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
}
