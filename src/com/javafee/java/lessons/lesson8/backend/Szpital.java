package com.javafee.java.lessons.lesson8.backend;

import java.util.*;

public class Szpital {

    Pracownicy pracownicy = new Pracownicy();
    Doktor doktor = new Doktor();

    public void addToPacjent(String inputString){
        Pacjent pacjent = new Pacjent();
        pacjent.nazwisko = inputString;
        pacjentNazwisko.put(inputString, pacjent);
    }
    public void removeToPacjent(String inputString){
        Pacjent pacjent = new Pacjent();
        pacjent.nazwisko = inputString;
        pacjentNazwisko.put(inputString, pacjent);
    }
    public void addToDoktor(String inputString){
        Pacjent pacjent = new Pacjent();
    }
    public void removeToDoktor(String inputString){
        Pacjent pacjent = new Pacjent();
    }
    public Szpital(){
        pacjentNazwisko.put("Kowalski", new Pacjent());
        pacjentNazwisko.put("Adamczyk", new Pacjent());
        pacjentNazwisko.put("Napora",new Pacjent());
        pacjentNazwisko.put("Daniel", new Pacjent());
        doktorNazwisko.put("Danek", new Doktor());
        doktorNazwisko.put("Dawidowski" , new Doktor());
        doktorNazwisko.put("Walczak" , new Doktor());
        doktorNazwisko.put("Wasiak", new Doktor());
        doktorNazwisko.put("Wcisło" , new Doktor());
    }
    HashMap<String,Doktor> doktorNazwisko = new HashMap<String,Doktor>();
    HashMap<String, Pacjent> pacjentNazwisko = new HashMap<String, Pacjent>();


    public void printDoktorInformacje(){
        System.out.println("Podaj nazwisko lekarza którego szukasz:");
        Scanner scanner = new Scanner(System.in);
        String uzytkownikInput = scanner.next();
        Doktor d = doktorNazwisko.get(uzytkownikInput);
        System.out.println("Imie lekarza" + d.imie);
        System.out.println("Czy lekarz ma certyfikat?" + d.jestCertyfikowany);
    }
    public void printPacjentInformacje(){
        System.out.println("Podaj nazwisko pacjenta którego szukasz:");
        Scanner scanner = new Scanner(System.in);
        String uzytkownikInput = scanner.next();
        Pacjent p = pacjentNazwisko.get(uzytkownikInput);
        System.out.println("Imie pacjenta" + p.imie);
        System.out.println("Czy pacjent nadal choruje?" +p.jestChory);
        System.out.println("Ile pacjent przebywa w szpitalu?" + p.liczbaDniWSzpitalu);
    }
    public void printSzpitalInformacje(){
        System.out.println("To jest centrum informacji szpitala:");
        System.out.println("===============");
        for(Map.Entry nazwisko : doktorNazwisko.entrySet()) {
            nazwisko.getKey();
            System.out.println("Doktor" + nazwisko);
        }
        System.out.println("===============");
        for(String nawisko : pacjentNazwisko.keySet()){
            System.out.println("Pacjent" + nawisko);
        }
        System.out.println("===============");
    }
}
