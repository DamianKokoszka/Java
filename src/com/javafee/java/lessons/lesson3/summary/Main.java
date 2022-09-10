package com.javafee.java.lessons.lesson3.summary;

public class Main {
    public static void main(String[] args) {
        Clazz clazz = new Clazz(); // tworzenie obiektu, wywoalnie konstruktora
        clazz.met1(); // wywolanie metody met1 na obiekcie clazz typu Clazz
        System.out.println(clazz.met2()); // wywolanie metody met2 na obiekcie clazz typu Clazz i wypisanie jej wyniku
        System.out.println(clazz.met3("a", "b", 3)); // wywolanie metody met2 na obiekcie clazz typu Clazz i wypisanie jej wyniku oraz przekzanie parametrow (argumentow) o wartosciach "a", "b", 3
    }
}
