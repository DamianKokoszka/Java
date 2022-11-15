package com.javafee.java.lessons.lesson11;

import java.util.Scanner;
import java.awt.Color;
public class KolkoKrzyzyk {
    public static final String ANSI_RED= "\u001B[31m";
    public static void main(String[] args) {
        System.out.println("Witaj w grze, podaj rozmiar planszy(\u001B[31m0-20)");
        int wymiar = new Scanner(System.in).nextInt();
        char Symbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
        boolean czyKontynowac = true;
        int licznikRuchow = 0;
        while (czyKontynowac && licznikRuchow <= wymiar * wymiar) {
            KolkoKrzyzyk.drukujPlansze(plansza);
            boolean ruchPoprawny = wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                licznikRuchow++;
                boolean wygranaWiersze = sprawdzWiersze(plansza, Symbol);
                boolean wygranaKolumny = sprawdzKolumny(plansza, Symbol);
                boolean wygranaSkos = sprawdzSkos(plansza, Symbol);
                if (wygranaWiersze || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol);
                    czyKontynowac = false;
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                }
                Symbol = Symbol == 'X' ? '0' : 'X';
            }

        }
    }



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
}
