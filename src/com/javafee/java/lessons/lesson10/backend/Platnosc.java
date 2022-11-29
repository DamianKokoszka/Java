package com.javafee.java.lessons.lesson10.backend;

public class Platnosc {
    float godzinaKwota = 30;
    float lacznaKwotaZaGodzine = 0;
    float lacznaKwotaZaMinute = 0;


    public float LacznaKwota(int Godzina, int Minuta){
        lacznaKwotaZaGodzine = Godzina * godzinaKwota;
        if(Minuta < 60 && Minuta >= 30){
            lacznaKwotaZaMinute = 20;
        }else if(Minuta < 30 && Minuta >=15){
            lacznaKwotaZaMinute = 15;
        }else if (Minuta < 15 && Minuta >= 1){
            lacznaKwotaZaMinute = 10;
        }
        return (lacznaKwotaZaMinute + lacznaKwotaZaMinute);
    }
}