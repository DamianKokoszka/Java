package com.javafee.java.lessons.lesson7.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order {
    private List<Car> carList = new ArrayList<>();
    private Client client;
    private Double cena;
    private String id ="";

    public Order(Client client){
        this.client = client;

        Random r = new Random();
        for(int i = 0; i <10; i++){
            id += String.valueOf(r.nextInt(100));
        }
    }
    public List<Car>getCars(){
        return carList;
    }
    public String getId(){
        return id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

}
