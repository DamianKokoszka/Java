package com.javafee.java.lessons.lesson7.backend;

import com.javafee.java.lessons.lesson7.backend.Car;
import com.javafee.java.lessons.lesson7.backend.Order;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private CarList carList = new CarList();
    private List<Order> orders = new ArrayList<>();

    public void addToMenu(String name,Double cena){
        Car car = new Car(name, cena);
        carList.add(car);
    }
    public String makeOrder(List<String> nameOfCars,Client client){
     Order order = new Order(client);
     for(int i =0; i<nameOfCars.size(); i++)
         if(checkIfTheCarExistsInMenu(nameOfCars.get(i))){
             Car car = getCarByName(nameOfCars.get(i));
             order.getCars().add(car);
         }else
             return null;
     order.setCena(calculatePrice(order.getCars()));
     orders.add(order);
     return order.getId();
    }
    public Double getOrderPrice(String id){
        for(Order order : orders)
            if(id.equals(order.getId()))
                return calculatePrice(order.getCars());
        return null;
    }
    private Double calculatePrice(List<Car> cars){
        Double cenaSuma = 0.0;
        for(Car car : cars)
            cenaSuma += car.getCena();
        return cenaSuma;
    }
    private boolean checkIfTheCarExistsInMenu(String name){
        for(Car c : carList.getCarList())
            if(c.getName().equals(name))
                return true;
        return false;
    }
    private Car getCarByName(String name){
        for(Car c : carList.getCarList())
            if(c.getName().equals(name))
                return c;
        return null;
    }

    public CarList getCarList() {
        return carList;
    }
}

