package com.javafee.java.lessons.lesson15.view;

import javax.swing.*;

public class MainForm {
    private JFrame frame;
    private JPanel panel;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JButton buttonCalculate;
    private JLabel labelResult;

    public MainForm() {
        frame = new JFrame("Calculator");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
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

    public JTextField getTextFieldC() {
        return textFieldC;
    }

    public JButton getButtonCalculate() {
        return buttonCalculate;
    }

    public JLabel getLabelResult() {
        return labelResult;
    }
}
