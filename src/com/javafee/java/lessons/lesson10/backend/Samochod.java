package com.javafee.java.lessons.lesson10.backend;

public class Samochod {
    public String NumerRejestracyjny;
    public String KolorSamochodu;//czerwony,czarny,bialy,zolty,pomaranczowy
    public String Marka;

    public String getNumerRejestracyjny(){
        return NumerRejestracyjny;
    }

    public String getKolorSamochodu() {
        return KolorSamochodu;
    }

    public String getMarka() {
        return Marka;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.NumerRejestracyjny = numerRejestracyjny;
    }

    public void setKolorSamochodu(String kolorSamochodu) {
        this.KolorSamochodu = kolorSamochodu;
    }

    public void setMarka(String marka) {
        this.Marka = marka;
    }
}
