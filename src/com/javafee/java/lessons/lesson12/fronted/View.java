package com.javafee.java.lessons.lesson12.fronted;

import com.javafee.java.lessons.lesson12.backend.Model;

import java.util.Scanner;

public class View {
    public Scanner scanner = new Scanner(System.in);
    private int wymiar;
    public View(){
    }
    private Model m = new Model();
    public String getInputString(String message){
        System.out.println(message);
        return scanner.next();
    }
    public void printError(String message){
        System.err.println(message);
    }
}
