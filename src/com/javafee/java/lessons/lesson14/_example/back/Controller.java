package com.javafee.java.lessons.lesson14._example.back;

import com.javafee.java.lessons.lesson14._example.front.View;

public class Controller {
    private View view = new View();
    private Calculator calculator = new Calculator();

    public void run() {
        String calculationType;
        Double var1, var2;
        while (true) {
            calculationType = view.getInputString("Provide calculation type:");
            if (calculationType.equalsIgnoreCase("exit"))
                break;
            var1 = view.getInputDouble("Provide first var:");
            var2 = view.getInputDouble("Provide second var:");
            view.printMessage("Result is: " + calculator.result(var1, var2, calculationType));
        }
    }
}
