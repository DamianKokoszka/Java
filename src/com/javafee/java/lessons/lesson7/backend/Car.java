package com.javafee.java.lessons.lesson7.backend;

import java.util.Objects;

public class Car {
    private String name;
    private Double cena;

    public Car(String name, double cena){
        this.name = name;
        this.cena = cena;
    }
    public void Car(){
        System.out.println("Car" + name + "cena" + cena);
    }

    public String getName() {
        return name;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() !=o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name ,car.name);
    }
    public int hashCode(){
        return Objects.hash(name);}

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", cena=" + cena +
                '}';
    }
}