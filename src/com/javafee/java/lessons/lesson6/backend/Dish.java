package com.javafee.java.lessons.lesson6.backend;

import java.util.Objects;

public class Dish {
    private String name;
    private int iloscdan;
    private Double cena;
    //TODO: [ref. 1] pole przechowujące ilość dań danego rodzaju

    public Dish(String name, Double cena) {
        this.name = name;
        this.cena = cena;
    }
    //TODO: konstruktor ustawiający wartość pola name (nazwa typu potrawy) oraz pola zawierającego cenę [ref. 1]

    public void Dish() {
        System.out.println("Dish" + name + "ilosc " + iloscdan);
    }
    //TODO: metoda wyświetlająca danie w postaci: "Dish{name=XXX, amount=YYY}


    public String getName() {
        return name;
    }

    public double getCena() {
        return cena;
    }

    public void setIloscdan(int iloscDan) {
        this.iloscdan = iloscDan;
    }
    //TODO: metoda pozwalająca ustawić ilość dań danego rodzaju [ref. 1]

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
