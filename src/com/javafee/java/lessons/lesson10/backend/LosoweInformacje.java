package com.javafee.java.lessons.lesson10.backend;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class LosoweInformacje {
    Random rand = new Random();

    String[] wojewodztwa = {"BI", "BL", "CB", "CG", "DJ", "DL", "EL", "EP", "FG",};
    String[] kolory = {"Czerwony", "Niebieski", "Zielony", "Bialy", "Zolty", "Fieletowy", "Pomaranczowy"};
    String[] marka = {"Sedan", "Van", "Minivan", "Bus", "Pickup-truck", "Hatchback"};

    public String NumerRejestracyjny() {
        int woj = rand.nextInt(wojewodztwa.length);
        return wojewodztwa[woj] + "_" + rand.nextInt((99 - 10) + 1) + 10;
    }

    public String KolorSamochodu() {
        int kol = rand.nextInt(kolory.length);
        return kolory[kol];
    }

    public String Marka() {
        int mar = rand.nextInt(marka.length);
        return marka[mar];
    }

    // informacje dotyczące biletu parkingowego
    public String Czas() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String wprowadzczas = localTime.format(dateTimeFormatter);
        return wprowadzczas;
    }

    public String CzasWyjscia() {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        String czaswyjscia = localTime.format(dateTimeFormatter);
        return czaswyjscia;
    }

    public String Data() {
        LocalDate mydate = LocalDate.now();
        return mydate.toString();
    }
    public String DataWyjscia() {
        LocalDate date = LocalDate.now();
        return date.toString();
    }

    String[] typkarty = {"Debit", "Credit"};

    public String TypKarty() {
        int tyka = rand.nextInt(typkarty.length);
        return typkarty[tyka];
    }

    public long NumerKarty() {
        return ((rand.nextInt() % 100000000000000L) + 5200000000000000L);
    }

}