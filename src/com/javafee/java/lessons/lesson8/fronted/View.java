package com.javafee.java.lessons.lesson8.fronted;

import com.javafee.java.lessons.lesson8.backend.Doktor;
import com.javafee.java.lessons.lesson8.backend.Pacjent;
import com.javafee.java.lessons.lesson8.backend.Szpital;

import java.util.Map;
import java.util.Scanner;

public class View {

    public Szpital szpital = new Szpital();
    public Scanner scanner = new Scanner(System.in);
    public void printMessage(String message) {
        System.out.println(szpital);
    }
    public void printError(String message){
        System.err.println(message);
    }
    public double getInputDouble(String message){
        System.out.println(message);
        return scanner.nextDouble();
    }
    public Integer getInputInteger(String message){
        System.out.println(message);
        return scanner.nextInt();
    }
    public String getInputString(String message) {
        System.out.println(message);
        return scanner.next();
        }
    }
