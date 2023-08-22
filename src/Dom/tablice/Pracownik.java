package Dom.tablice;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double wyplata;

    public Pracownik(String imie, String naziwsko, double wyplata){
        this.imie = imie;
        this.nazwisko = naziwsko;
        this.wyplata = wyplata;
    }

    String getImie(){
        return imie;
    }
    String getNazwisko(){
        return imie;
    }
    double getWyplata(){
        return  wyplata;
    }
    public String toString(){
        return "Imię: " + imie + "Nazwisko: " + nazwisko + "Wyplata: " + wyplata;
    }
}