package com.javafee.java.lessons.lesson6.backend;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{name= '" + name + "'}";
    }
}
