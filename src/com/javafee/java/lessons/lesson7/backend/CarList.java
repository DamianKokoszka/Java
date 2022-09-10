package com.javafee.java.lessons.lesson7.backend;


import java.util.ArrayList;

public class CarList {
    private ArrayList<Car> carList = new ArrayList<>();
    public void add(Car car) {
        carList.add(car);
    }
    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void print() {
        for (Car c : carList) {
            System.out.println(c.toString());
        }
    }
}
