package com.javafee.java.lessons.lesson25.abstracts;

public abstract class Emeryt {
    public static final int ILOSC_Oczu = 2;

    //metoda abstrakcyjna
    public String krzyczNaKota(){
        return null;
    }

    public static void biegnijDoSklepu(int odleglosc, int predkosc){
        double czas = (double) odleglosc/predkosc;
        System.out.println("Biegne po picie bede za " + czas);
    }


}
