package com.javafee.java.lessons.lesson12.backend;

import java.awt.image.WritableRenderedImage;
import java.util.Scanner;

public class Akcje {
    private int wymiar;


    public static boolean sprawdzSkos(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean sprawdzKolumny(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if(wygrana){return  true;}
        }
        return false;
    }

    public static boolean sprawdzWiersze(char[][] plansza, char symbol){
        int wymiar = plansza.length;
        for(int wiersz = 0; wiersz<wymiar; wiersz++){
            boolean wygrana = true;
            for(int kolumna = 0; kolumna <wymiar; kolumna++){
                if(plansza[wiersz][kolumna] != symbol){
                    wygrana = false;
                    break;
                }
            }
            if(wygrana){return true;}
        }
        return false;
    }

    public static boolean wykonajRuch(char[][] planasz,char Symbol){
        System.out.println(Symbol +" twoj ruch");
        System.out.println("Podaj indeks wiersza");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println("Podaj indeks kolumny");
        int kolumna = new Scanner(System.in).nextInt();
        if(wiersz < 0 || kolumna < 0 || kolumna >= planasz[0].length || wiersz >= planasz.length){
            System.out.println("Podaj poprawna liczbe wiersza i kolumny");
            return false;
        }
        boolean ruchPoprawny = planasz[wiersz] [kolumna] == 0;
        if(ruchPoprawny){
            planasz[wiersz][kolumna]= Symbol;
            return true;
        } else {
            return false;
        }
    }

    public static void drukujPlansze(char[][] plansza){
        int wymiar = plansza.length;
        System.out.print("\t");
        for(int i = 0; i <wymiar; i++){
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int wiersz = 0; wiersz <wymiar; wiersz++){
            System.out.print(wiersz + "\t");
            for(int kolumna = 0; kolumna<wymiar;kolumna++){
                System.out.print(plansza [wiersz][kolumna] + "\t");
            }
            System.out.println();
        }
    }
    public static void drukujPlanszeGracza(char[][] plansza){
        int wymiarX = plansza.length;
        int wymiarY = plansza[0].length;
        System.out.print("\t");
        for(int i = 0; i <wymiarY; i++){
           System.out.print(i + "\t");
       }
        System.out.println();
        for (int wiersz = 0; wiersz <wymiarX; wiersz++){
            System.out.print(wiersz + "\t");
            for(int kolumna = 0; kolumna<wymiarY;kolumna++){
                System.out.print(plansza [wiersz][kolumna] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean sprawdzWierszeGracza(char[][] plansza, char symbol){
        int wymiarX = plansza.length;
        int wymiarY = plansza[0].length;
        for(int wiersz = 0; wiersz<wymiarX; wiersz++){
            boolean wygrana = true;
            for(int kolumna = 0; kolumna <wymiarY; kolumna++){
                if(plansza[wiersz][kolumna] != symbol){
                    wygrana = false;
                    break;
                }
            }
            if(wygrana){return true;}
        }
        return false;
    }

    public static boolean sprawdzKolumnyGracza(char[][] plansza, char symbol) {
        int wymiarX = plansza.length;
        int wymiarY = plansza[0].length;
        for (int wiersz = 0; wiersz < wymiarX; wiersz++) {
            boolean wygrana = true;
            for (int kolumna = 0; kolumna < wymiarY; kolumna++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if(wygrana){return  true;}
        }
        return false;
    }
    public static boolean sprawdzSkosGracza(char[][] plansza, char symbol) {
        int wymiarY = plansza[0].length;
        for (int i = 0; i < wymiarY; i++) {
            if (plansza[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }
}
