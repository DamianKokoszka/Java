package com.javafee.java.lessons.lesson24;

import com.javafee.java.lessons.lesson23.Person;
import com.javafee.java.lessons.lesson24.model.Car;
import com.javafee.java.lessons.lesson24.model.MapperService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[]) throws IOException {
        Car car1 = new Car("BMW", "M4", "Bez wypadkowa", 2993., 510., "Benzyna", true, "Pierwszy"),
                car2 = new Car("Audi", "M4", "Bez wypadkowa", 2993., 510., "Diesel", false, "Drugi"),
                car3 = new Car("Mercedes", "M4", "Wypadkowy", 2993., 510., "Benzyna", false, "Piaty");

        FileService fileService = new FileService();
        //fileService.save("cars.txt", Stream.of(car1,car2,car3).map(MapperService::carTo).collect(Collectors.toList()));
        List<Car> data = fileService.read("cars.txt").stream().map(MapperService::carFrom).toList();
        // for (po liście samochodów)
        for (int i = 0; i < 2; i++) {
            List<Car> list = new ArrayList<Car>();
            Car bmw = new Car("BMW");
            Car audi = new Car("Audi");
            Car mercedes = new Car("Mercedes");

            list.add(bmw);
            list.add(audi);
            list.add(mercedes);

        }
        // 1. Utwórz listę samochodów wypełniając ją obiektami car1, car2, car3
        // TODO: tu kod
        List<Car> list = new ArrayList<Car>();
        list.add(car1);
        list.add(car2);
        list.add(car3);

        // 2. Utwórz pusta lista strigów
        // TODO: tu kod
        List<String> Plist = new ArrayList<>();

        // 3. Utwórz pętlę i iteruj po liście samochodów
        // TODO: tu kod
        for (int i = 0; i < list.size(); i++) {
            // 4. Wewnątrz pętli zamieniaj każdy samochód na string i dodawaj do do listy z pkt. 2.
            // TODO: tu kod
            String str = MapperService.carTo(list.get(i));
            Plist.add(str);
        }
        // 5. Zapisz zawartość listy z pkt. 2 do pliku używająć metody save
        // TODO: tu kod
        fileService.save("cars.txt", Plist);



        System.out.println("Lista Samochodow");
        fileService.read("cars.txt").forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Które auto chcesz usunac? ");
        String toRemove = scanner.next();
        List<Car> filteredList = data.stream().filter(e -> !toRemove.equals(e.getMark())).toList();

        System.out.println("Nowa lista:");
        fileService.read("cars.txt").forEach(System.out::println);

    }
}