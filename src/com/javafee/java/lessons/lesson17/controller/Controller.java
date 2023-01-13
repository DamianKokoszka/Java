package com.javafee.java.lessons.lesson17.controller;

import com.javafee.java.lessons.lesson17.model.Converter;
import com.javafee.java.lessons.lesson17.view.MainForm;

import java.util.ArrayList;

public class Controller {
    private MainForm mainForm;
    private Converter converter = new Converter("USD","EUR");

    public void control() {
        init();
        mainForm.getButtonConverter().addActionListener(e -> onClickButtonConverter());
    }

    private void init() {
        mainForm = new MainForm();
        mainForm.getFrame().setVisible(true);
        converter.init();
    }


        private void onClickButtonConverter() {
        Double amount = Double.parseDouble(mainForm.getTextFieldA().getText());
        String exchangeValue =(mainForm.getTextFieldB().getText());
        Double result = converter.convert("USD","CHF");
        mainForm.getLabelResult().setText(String.valueOf(result));
    }




}
