package com.javafee.java.lessons.lesson14._tmp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextField textFieldVar1;
    private JTextField textFieldVar2;
    private JButton buttonCalculate;
    private JTextField textFieldCalculationType;
    private JPanel panel;
    private JLabel labelResult;
    private JTextField textFieldResult;

    public MainForm() {
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textFieldCalculationType.getText().equals("+"))
                    labelResult.setText(String.valueOf(Double.parseDouble(textFieldVar1.getText()) + Double.parseDouble(textFieldVar2.getText())));
                else  if(textFieldCalculationType.getText().equals("-"))
                    labelResult.setText(String.valueOf(Double.parseDouble(textFieldVar1.getText()) - Double.parseDouble(textFieldVar2.getText())));
                else  if(textFieldCalculationType.getText().equals("*"))
                    labelResult.setText(String.valueOf(Double.parseDouble(textFieldVar1.getText()) * Double.parseDouble(textFieldVar2.getText())));
                else  if(textFieldCalculationType.getText().equals("/"))
                    labelResult.setText(String.valueOf(Double.parseDouble(textFieldVar1.getText()) / Double.parseDouble(textFieldVar2.getText())));
                else
                    labelResult.setText("Nieprawidłeowy znak działania");
            }
        });
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
