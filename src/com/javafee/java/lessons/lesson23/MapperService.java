package com.javafee.java.lessons.lesson23;

public class MapperService {
    public static String personTo(Person person){
        return person.toString();
    }

    public static Person personFrom(String string){
        String[] parts = string.split(",");
        return new Person(parts[0],Integer.parseInt(parts[1]));
    }
}
