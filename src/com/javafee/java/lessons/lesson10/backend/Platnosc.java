package com.javafee.java.lessons.lesson10.backend;

public class Platnosc {
    float GodzinaKwota = 30;
    float LacznaKwotaZaGodzine = 0;
    float LacznaKwotaZaMinute = 0;


    public float LacznaKwota(int Godzina, int Minuta){
        LacznaKwotaZaGodzine = Godzina * GodzinaKwota;
        if(Minuta < 60 && Minuta >= 30){
            LacznaKwotaZaMinute = 20;
        }else if(Minuta < 30 && Minuta >=15){
            LacznaKwotaZaMinute = 15;
        }else if (Minuta < 15 && Minuta >= 1){
            LacznaKwotaZaMinute = 10;
        }
        return (LacznaKwotaZaMinute + LacznaKwotaZaMinute);
    }
}