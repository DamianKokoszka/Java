package com.javafee.java.lessons.lesson24.model;

public class MapperService {

    public static String carTo(Car car){
        return car.toString();
    }

    public static Car carFrom(String string) {
        String[] cars = string.split(",");
        return new Car(cars);
    }
}
