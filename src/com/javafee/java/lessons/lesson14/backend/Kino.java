package com.javafee.java.lessons.lesson14.backend;

import com.javafee.java.lessons.lesson14.backend.Bilety.Bilet;
import com.javafee.java.lessons.lesson14.backend.Bilety.BiletRezerwacja;
import com.javafee.java.lessons.lesson9.backend.Rezerwacje;

import java.util.ArrayList;

public class Kino {
    public Bilet bilet = new Bilet();
    public BiletRezerwacja biletRezerwacja = new BiletRezerwacja();
    public Sala sala = new Sala();
    public Seans seans = new Seans();

    ArrayList<Film> filmy = new ArrayList<>();
    ArrayList<Rezerwacje> film = new ArrayList<>();

    public void add(Film film) {
        filmy.add(film);
    }
    public String toString(){
        return "Szczegoly Biletu: \nBiletID = " + bilet.getBiletIDnumer()+
                "\nData:" + seans.getData() +
                "\nGodzina: "+ seans.getGodzina() +
                "\nCena: " + bilet.getCena() + "zl" +
                "\nFilm: " + filmy;
    }
}
