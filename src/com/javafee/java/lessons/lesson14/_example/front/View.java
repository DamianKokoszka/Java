package com.javafee.java.lessons.lesson14._example.front;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String getInputString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public Double getInputDouble(String message) {
        System.out.println(message);
        return scanner.nextDouble();
    }
}
