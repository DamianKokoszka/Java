package com.javafee.java.lessons.lesson16.view;

import javax.swing.*;

public class MainForm {
    private JFrame frame;
    private JPanel panel;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldCalculationType;
    private JLabel labelResult;
    private JButton buttonCalculate;

    public MainForm() {
        frame = new JFrame("Calculator");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getTextFieldA() {
        return textFieldA;
    }

    public JTextField getTextFieldB() {
        return textFieldB;
    }

    public JTextField getTextFieldCalculationType() {
        return textFieldCalculationType;
    }

    public JLabel getLabelResult() {
        return labelResult;
    }

    public JButton getButtonCalculate() {
        return buttonCalculate;
    }

}
