package com.javafee.java.lessons.lesson22;

public class MapperService {
    public static String petTo(Pet pet) {
        return pet.toString();
    }

    public static Pet petFrom(String string) {
        String[] parts = string.split(",");
        return new Pet(parts[0], Integer.parseInt(parts[1]));
    }
}
