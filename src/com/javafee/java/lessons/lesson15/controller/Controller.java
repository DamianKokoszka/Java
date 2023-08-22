package com.javafee.java.lessons.lesson15.controller;

import com.javafee.java.lessons.lesson15.model.QuadraticEquationCalculator;
import com.javafee.java.lessons.lesson15.model.Result;
import com.javafee.java.lessons.lesson15.view.MainForm;

public class Controller {
    private MainForm mainForm;
    private QuadraticEquationCalculator quadraticEquationCalculator;

    public void control() {
        init();
        mainForm.getButtonCalculate().addActionListener(e -> onClickButtonCalculate());
    }

    private void init() {
        mainForm = new MainForm();
        quadraticEquationCalculator = new QuadraticEquationCalculator();
        mainForm.getFrame().setVisible(true);
    }

    private void onClickButtonCalculate() {
        Result res = quadraticEquationCalculator.calculate(
                Double.parseDouble(mainForm.getTextFieldA().getText()),
                Double.parseDouble(mainForm.getTextFieldB().getText()),
                Double.parseDouble(mainForm.getTextFieldC().getText())
        );
        mainForm.getLabelResult().setText(res.toString());
    }
}
