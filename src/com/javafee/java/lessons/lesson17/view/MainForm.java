package com.javafee.java.lessons.lesson17.view;

import com.javafee.java.lessons.lesson17.model.Converter;

import javax.swing.*;
import java.util.ArrayList;

public class MainForm {
    private JFrame frame;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JPanel panel;
    private JLabel LabelConvert;
    private JButton buttonConverter;

    public MainForm(){
       frame = new JFrame("Conventer");
       frame.setContentPane(panel);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getTextFieldA() {
        return textFieldA;
    }

    public JTextField getTextFieldB() {
        return textFieldB;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JLabel getLabelResult() {
        return LabelConvert;
    }

    public JButton getButtonConverter() {
        return buttonConverter;
    }

}
