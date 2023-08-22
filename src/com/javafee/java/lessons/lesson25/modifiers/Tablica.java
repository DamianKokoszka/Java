package com.javafee.java.lessons.lesson25.modifiers;

public class Tablica {
    public static void main(String[] args){
        System.out.print("Przywitaj sie!");
    }
    public void metoda1(){
        System.out.println("Ta metoda nic nie zawiera");
    }

    public int dwa(){
        return 2; // ta metoda zwraca liczbę 2
    }

    public int suma(int a,int b){
        return a+b; // ta metoda zwraca sume dwoch parametrów
    }

}
