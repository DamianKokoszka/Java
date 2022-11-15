package com.javafee.java.lessons.lesson12.backend;


import com.javafee.java.lessons.lesson11.KolkoKrzyzyk;

import java.util.Scanner;

public class Model {
        Akcje akcje = new Akcje();

    public void Latwy(){
        int wymiar = 3;
        char Symbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
        boolean czyKontynowac = true;

        int LicznikRuchow = 0;
        while (czyKontynowac && LicznikRuchow <= wymiar * wymiar) {
            Akcje.drukujPlansze(plansza);
            boolean ruchPoprawny = Akcje.wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                LicznikRuchow++;
                boolean wygranaWiersza = Akcje.sprawdzWiersze(plansza, Symbol);
                boolean wygranaKolumny = Akcje.sprawdzKolumny(plansza, Symbol);
                boolean wygranaSkos = Akcje.sprawdzSkos(plansza, Symbol);
                if (wygranaWiersza || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol + " Wykonane ruchy " + LicznikRuchow);
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                    czyKontynowac = false;
                }
                Symbol = Symbol == 'X' ? 'O' : 'X';
            }
        }
    }
    public void Sredni(){
        int wymiar = 6;
        char Symbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
        boolean czyKontynowac = true;

        int LicznikRuchow = 0;
        while (czyKontynowac && LicznikRuchow <= wymiar * wymiar) {
            Akcje.drukujPlansze(plansza);
            boolean ruchPoprawny = Akcje.wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                LicznikRuchow++;
                boolean wygranaWiersza = Akcje.sprawdzWiersze(plansza, Symbol);
                boolean wygranaKolumny = Akcje.sprawdzKolumny(plansza, Symbol);
                boolean wygranaSkos = Akcje.sprawdzSkos(plansza, Symbol);
                if (wygranaWiersza || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol + " Wykonane ruchy " + LicznikRuchow);
                    czyKontynowac = false;
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                }
                Symbol = Symbol == 'X' ? '0' : 'X';
            }
        }
    }
    public void Trudny(){
        int wymiar = 9;
        char Symbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
        boolean czyKontynowac = true;

        int LicznikRuchow = 0;
        while (czyKontynowac && LicznikRuchow <= wymiar * wymiar) {
            Akcje.drukujPlansze(plansza);
            boolean ruchPoprawny = Akcje.wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                LicznikRuchow++;
                boolean wygranaWiersza = Akcje.sprawdzWiersze(plansza, Symbol);
                boolean wygranaKolumny = Akcje.sprawdzKolumny(plansza, Symbol);
                boolean wygranaSkos = Akcje.sprawdzSkos(plansza, Symbol);
                if (wygranaWiersza || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol + " Wykonane ruchy " + LicznikRuchow);
                    czyKontynowac = false;
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                }
                Symbol = Symbol == 'X' ? '0' : 'X';
            }
        }
    }
    public void BardzoTrudny(){
        int wymiar = 12;
        char Symbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
        boolean czyKontynowac = true;

        int LicznikRuchow = 0;
        while (czyKontynowac && LicznikRuchow <= wymiar * wymiar) {
            Akcje.drukujPlansze(plansza);
            boolean ruchPoprawny = Akcje.wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                LicznikRuchow++;
                boolean wygranaWiersza = Akcje.sprawdzWiersze(plansza, Symbol);
                boolean wygranaKolumny = Akcje.sprawdzKolumny(plansza, Symbol);
                boolean wygranaSkos = Akcje.sprawdzSkos(plansza, Symbol);
                if (wygranaWiersza || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol + " Wykonane ruchy " + LicznikRuchow);
                    czyKontynowac = false;
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                }
                Symbol = Symbol == 'X' ? '0' : 'X';
            }
        }
    }
    public void Test(){
        int wymiar = 2;
        char Symbol = 'X';
        char[][] plansza = new char[wymiar][wymiar];
        boolean czyKontynowac = true;

        int LicznikRuchow = 0;
        while (czyKontynowac && LicznikRuchow <= wymiar * wymiar) {
            Akcje.drukujPlansze(plansza);
            boolean ruchPoprawny = Akcje.wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                LicznikRuchow++;
                boolean wygranaWiersza = Akcje.sprawdzWiersze(plansza, Symbol);
                boolean wygranaKolumny = Akcje.sprawdzKolumny(plansza, Symbol);
                boolean wygranaSkos = Akcje.sprawdzSkos(plansza, Symbol);
                if (wygranaWiersza || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol + " Wykonane ruchy " + LicznikRuchow);
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                    czyKontynowac = false;
                }
                Symbol = Symbol == 'X' ? '0' : 'X';
            }
        }
    }
    public void graczaWybor(){
        int wymiarX = new Scanner(System.in).nextInt();
        int wymiarY = new Scanner(System.in).nextInt();
        char Symbol = 'X';
        char[][] plansza = new char[wymiarX][wymiarY];
        boolean czyKontynowac = true;

        int LicznikRuchow = 0;
        while (czyKontynowac && LicznikRuchow <= wymiarX * wymiarY) {
            Akcje.drukujPlanszeGracza(plansza);
            boolean ruchPoprawny = Akcje.wykonajRuch(plansza, Symbol);
            if (ruchPoprawny) {
                LicznikRuchow++;
                boolean wygranaWiersza = Akcje.sprawdzWierszeGracza(plansza, Symbol);
                boolean wygranaKolumny = Akcje.sprawdzKolumnyGracza(plansza, Symbol);
                boolean wygranaSkos = Akcje.sprawdzSkosGracza(plansza, Symbol);
                if (wygranaWiersza || wygranaKolumny || wygranaSkos) {
                    System.out.println("Gratulacje " + Symbol + " Wykonane ruchy " + LicznikRuchow);
                    System.out.println("Wygrana Plansza ");
                    KolkoKrzyzyk.drukujPlansze(plansza);
                    czyKontynowac = false;
                }
                Symbol = Symbol == 'X' ? '0' : 'X';
            }
        }
    }
}
