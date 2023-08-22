package com.javafee.java.lessons.lesson25.mvc;

public class MapperService {
    public static String pracownikTo(Pracownik pracownik){
        return pracownik.toString();
    }

    public static Pracownik pracownikFrom(String string){
        String[] parts = string.split(",");
        return new Pracownik(parts[0],Integer.parseInt(parts[1]));
    }
}
