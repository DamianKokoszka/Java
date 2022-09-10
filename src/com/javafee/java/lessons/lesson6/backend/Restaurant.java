package com.javafee.java.lessons.lesson6.backend;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Dish> menu = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addToMenu(String name, Double price) {
        Dish dish = new Dish(name, price);
        menu.add(dish);
        //TODO: dodaje danie do menu przekazujac jego nazwe i cene (metoda add listy menu) [ref. 2]
    }

    public String makeOrder(List<String> nameOfDishes, List<Integer> amounts, Client client) {
        Order order = new Order(client);
        for (int i = 0; i < nameOfDishes.size(); i++)
            if (checkIfTheDishExistsInMenu(nameOfDishes.get(i))) {
                Dish dish = getDishByName(nameOfDishes.get(i));
                dish.setIloscdan(amounts.get(i));
                //TODO: ustawienie ilości dań danego rodzaju poprzez pobranie tej wartości jako amounts[i] i użycie metody setAmount (lub podobnej, w zależności od jej nazwy)
                order.getDishes().add(dish);
            } else
                return null;
        order.setPrice(calculatePrice(order.getDishes()));
        orders.add(order);
        return order.getId();
    }

    public Double getOrderPrice(String id) {
        // pętla po lisście orders (lista wszystkich zamówień w restuaracji)
        for(Order order : orders)
            // jeśli kolejne zamówienie ma id == id przekazanego w parametrrze
            if(id.equals(order.getId()))
                return calculatePrice(order.getDishes());

        // to wywolujemy metode calculatePrice przekazujac dishes z obiektu order
        // wyliczona wartoscc double zwracamy
        //TODO: metoda wyszukująca dania w liście orderów i zwracająca sumaryczną cenę zamówienia, jeśli danego dania, o podanym id nie ma w liście zamówień, metoda zwraca null
        return null; //TODO: linia w zależności od potrzeb - do usunięcia
    }

    private Double calculatePrice(List<Dish> dishes) {
        Double cenaSuma = 0.0;
        for (Dish dish : dishes)
            cenaSuma += dish.getCena();
       // for(int i = 0; i < dishes.size(); i++)
        // cenaSuma += dishes.get(i).getCena();
        //TODO: metoda obliczająca wartość zamówienia na podstawie dań, które znajdując się w liście (każde danie powinno mieć ustawioną swoją cenę. Cena dania jest ustawiana podczas dodawania dania do menu [ref. 2]
        return cenaSuma;
    }

    private boolean checkIfTheDishExistsInMenu(String name) {
        for (Dish d : menu)
            if (d.getName().equals(name))
                return true;
        return false;
    }

    private Dish getDishByName(String name) {
        for (Dish d : menu)
            if (d.getName().equals(name))
                return d;
        return null;
    }
}
