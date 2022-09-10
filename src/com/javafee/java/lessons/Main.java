package com.javafee.java.lessons;

import com.javafee.java.lessons.lesson3.Audi;
import com.javafee.java.lessons.lesson3.BMW;
import com.javafee.java.lessons.lesson3.Ford;
import com.javafee.java.lessons.lesson3.Samochod;

public class Main {
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 4;
        int suma = a + b + c;

        Audi audi1 = new Audi();
        Samochod audi = new Audi();
        Samochod prywatny = new Samochod(); // -> wywolanie konstruktora (nazwya sie jak klasa i poprzedza go slowo kluczowe new)
        audi1.setCena(40000);
        double cena2 = ((Audi)audi1).cenaPoRabacie(10); // obiekt.metoda(argumenty); -> wywołanie metody
        System.out.println( ((Audi)audi1).cenaPoRabacie(10));
        Ford ford = new Ford();
        Samochod ford1 = new Ford();
        ford.setCena(25000);
        double cena = ((Ford)ford).cenaPoRabacie(7);
        System.out.println(cena);
        BMW bmw1 = new BMW();
        Samochod BMW1 = new BMW();
        bmw1.setCena(60000);
        double cena1 = ((BMW)bmw1).cenaPoRabacie(3);
        System.out.println(((BMW)bmw1).cenaPoRabacie(3));
    }
}
