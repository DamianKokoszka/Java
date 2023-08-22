package com.javafee.java.lessons.lesson24.model;

import javax.xml.crypto.Data;

public class Client {
    private int id;
    private String firtsName;
    private String lastName;

    public Client(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
