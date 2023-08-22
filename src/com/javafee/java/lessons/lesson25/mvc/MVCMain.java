package com.javafee.java.lessons.lesson25.mvc;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MVCMain {
    public static void main(String[] args) throws IOException {
        Pracownik pracownik = new Pracownik("Dawid" , 3);
        FileService fileService = new FileService();
        fileService.save("mvcperson.txt", Stream.of(pracownik).map(MapperService::pracownikTo).collect(Collectors.toList()));
        List<Pracownik> data = fileService.read("mvcperson.txt").stream().map(MapperService::pracownikFrom).toList();
        System.out.println("Lista");
        fileService.read("mvcperson.txt").forEach(System.out::println);
        Pracownik model = pobierzPracownikaZBazyDanych();
        PracownikView view = new PracownikView();
        PracownikController controller = new PracownikController(model,view);
        controller.updateView();

        controller.setPracownikImie("Krzysiek");
        System.out.println("\nDane pracownika po aktualizacji: ");
        controller.updateView();
    }

    private static Pracownik pobierzPracownikaZBazyDanych(){
        Pracownik Pracownik = new Pracownik("Tomek" , 6);
        Pracownik.setName("Tomek");
        Pracownik.setId("6");
        Pracownik.setDepartment("IT");
        return Pracownik;
    }
}
