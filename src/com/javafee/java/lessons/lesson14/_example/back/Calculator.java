package com.javafee.java.lessons.lesson14._example.back;

public class Calculator {
    public Double result(double var1, double var2, String calculationType) {
        return switch (calculationType) {
            case "+" -> var1 + var2;
            case "-" -> var1 - var2;
            case "*" -> var1 * var2;
            case "/" -> var1 / var2;
            default -> null;
        };
    }
}
