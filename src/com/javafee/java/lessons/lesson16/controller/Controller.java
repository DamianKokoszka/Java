package com.javafee.java.lessons.lesson16.controller;

import com.javafee.java.lessons.lesson16.model.Calculator;
import com.javafee.java.lessons.lesson16.view.MainForm;

public class Controller {
    private MainForm mainForm;
    private Calculator calculator;

    public void control() {
        init();
        mainForm.getButtonCalculate().addActionListener(a -> onClickButtonCalculate());
    }

    public void init() {
        mainForm = new MainForm();
        calculator = new Calculator();
        mainForm.getFrame().setVisible(true);
    }

    private void onClickButtonCalculate() {
        Double var1 = Double.parseDouble(mainForm.getTextFieldA().getText());
        Double var2 = Double.parseDouble(mainForm.getTextFieldB().getText());
        String calculationType = mainForm.getTextFieldCalculationType().getText();
        Double result = calculator.result(var1, var2, calculationType);
        mainForm.getLabelResult().setText(String.valueOf(result));
    }
}
