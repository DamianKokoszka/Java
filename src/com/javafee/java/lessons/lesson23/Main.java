package com.javafee.java.lessons.lesson23;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Dawid", 20),
                person2 = new Person("Adam", 27),
                person3 = new Person("Krzysiek", 32),
                person4 = new Person("Olek", 19);


        FileService fileService = new FileService();
        fileService.save("person.txt", Stream.of(person1, person2, person3, person4).map(MapperService::personTo).collect(Collectors.toList()));

        List<Person> data = fileService.read("person.txt").stream().map(MapperService::personFrom).toList();

        System.out.println("Lista");
        fileService.read("person.txt").forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Która osobe chcesz usunac?");
        String toRemove = scanner.next();
        List<Person> filteredList = data.stream().filter(e -> !toRemove.equals(e.getName())).toList();
        fileService.save("person.txt", filteredList.stream().map(MapperService::personTo).collect(Collectors.toList()));

        System.out.println("Nowa lista osob");
        fileService.read("person.txt").forEach(System.out::println);


        System.out.println("Która osobe chcesz zmodyfikowac?");
        for (int i =0;i<3;i++)

        //TODO:
        //for (tablica osob od 0>3)


        System.out.println("Co chcesz zmodyfikowac?");
        //TODO:
        String toChangee = scanner.next();
        List<Person> filterdChange = data.stream().filter(e -> toChangee.equals(e.getName())).toList();
        fileService.save("person.txt",filterdChange.stream().map(MapperService::personTo).collect(Collectors.toList()));

        System.out.println("Podaj zmodyfikowana wartosc");
        //TODO:


        System.out.println("Zmodyfikowana lista osob");
        fileService.read("person.txt").forEach(System.out::println);
    }
}
