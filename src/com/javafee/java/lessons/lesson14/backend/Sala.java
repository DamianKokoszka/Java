package com.javafee.java.lessons.lesson14.backend;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sala {
    int kol;
    int rzed;

    private static String[][] stworzPusteMiejsca(int kolumny, int rzedy){
        String[][] miejsca = new String[kolumny][];

        for(int i = 0;i < kolumny; i++){
            String[] kol = new String[rzedy];
            Arrays.fill(kol, "S");
            miejsca[i] = kol;
        }
        return miejsca;
    }
}
