package com.javafee.java.lessons.lesson9.backend;

import com.javafee.java.lessons.lesson8.backend.Pacjent;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Rezerwacje> pokoj;
    private int pnum = 1;
    Rezerwacje rezerwacjeObj;

    public Hotel() {
        pokoj = new ArrayList<Rezerwacje>();
        pokoj.ensureCapacity(5);
        for (int i = 0; i < 5; i++) {
            pokoj.add(null);
        }
    }

    public Hotel(int numPokoj) {
        pokoj = new ArrayList<Rezerwacje>();
        pokoj.ensureCapacity(numPokoj);
        for (int i = 0; i < numPokoj; i++) {
            pokoj.add(null);
        }
    }

    public boolean DodajPokoj(int num) {
        if (num <= 0) {
            return false;
        }
        pokoj.ensureCapacity(pokoj.size() + num);
        for (int i = 0; i < num; i++)
            pokoj.add(null);

        return true;
    }

    public int RezerwacjaPokoju(String osoba) {
        for (int i = 0; i < pokoj.size(); i++) {
            if (pokoj.get(i) == null) {
                rezerwacjeObj = new Rezerwacje(osoba);
                rezerwacjeObj.setPokoj(pnum);
                pokoj.set(i, rezerwacjeObj);
                pnum++;
                return pnum - 1;
            }
        }
        return -1;
    }

    public boolean RezerwacjaPokoju(String osoba, int numPokoj) {
        try {
            if (pokoj.get(-1) == null) {
                rezerwacjeObj = new Rezerwacje(osoba, numPokoj);
                pokoj.set(numPokoj - 1, rezerwacjeObj);
                pnum++;
                return true;
            }
        } catch (Exception d) {
            return false;
        }
        return false;
    }

    public boolean AnulowanieRezerwacji(String osoba) {
        for (int i = 0; i < pokoj.size(); i++)
            if (pokoj.get(i) != null)
                if (pokoj.get(i).getImie().equals(osoba)) {
                    pokoj.set(i, null);
                }
        return false;
    }

    public void DrukujRezerwacje() {
        for (int i = 0; i < pokoj.size(); i++)
            if (pokoj.get(i) != null) {
                System.out.println(pokoj.get(i));
            } else {
                System.out.println((i + 1) + "nie jest zarezerwowany");
            }

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "pokoj=" + pokoj +
                ", pnum=" + pnum +
                ", rezerwacjeObj=" + rezerwacjeObj +
                '}';
    }
}