package com.javafee.java.lessons.lesson22;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Pet pet1 = new Pet("Neville", 12),
                pet2 = new Pet("Rex", 2),
                pet3 = new Pet("Micky", 1),
                pet4 = new Pet("Azor", 13);

        FileService fileService = new FileService();
        fileService.save("pets.txt", Stream.of(pet1, pet2, pet3, pet4).map(MapperService::petTo).collect(Collectors.toList()));

        List<Pet> data = fileService.read("pets.txt").stream().map(MapperService::petFrom).toList();

        System.out.println("Before removal  -------------------------------------------------------------------------");
        fileService.read("pets.txt").forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which pet do u want to remove?");
        String toRemove = scanner.next();

        List<Pet> filteredList = data.stream().filter(e -> !toRemove.equals(e.getName())).toList();

        fileService.save("pets.txt", filteredList.stream().map(MapperService::petTo).collect(Collectors.toList()));

        System.out.println("Result ----------------------------------------------------------------------------------");
        fileService.read("pets.txt").forEach(System.out::println);
    }
}
