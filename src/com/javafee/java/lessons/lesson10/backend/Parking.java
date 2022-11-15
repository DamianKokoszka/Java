package com.javafee.java.lessons.lesson10.backend;

import java.util.ArrayList;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {

        ArrayList<BiletParkingowy> przypisanemiejscalist = new ArrayList<>();

        MiejsceParkingowe miejsceParkingowe = new MiejsceParkingowe();
        LosoweInformacje losoweInformacje = new LosoweInformacje();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Chcesz zaparkować swój pojazd:");
            int userinput = Integer.parseInt(scan.next()); //TODO: zmienic na int
            int size = userinput;

            BiletParkingowy biletparkingowy = new BiletParkingowy();
            Samochod samochod = new Samochod();

            if (size == 5) { //TODO: zrobic switch zamiast if/else if/else
                System.out.println("\033\143");
                String kolorsamochodu = losoweInformacje.KolorSamochodu();
                String numerrejestracyjny = losoweInformacje.NumerRejestracyjny();
                String marka = losoweInformacje.Marka();

                biletparkingowy.setPrzypisanieSamochodu(samochod);
                biletparkingowy.getPrzypisanieSamochodu().setNumerRejestracyjny(numerrejestracyjny);
                biletparkingowy.getPrzypisanieSamochodu().setKolorSamochodu(kolorsamochodu);
                biletparkingowy.getPrzypisanieSamochodu().setMarka(marka);

                int NumerMiejsca = miejsceParkingowe.NumerMiejsca();
                if (NumerMiejsca == 0) {
                    System.out.println("Przepraszamy,miejsce jest niedostepne.");
                    continue;
                }
                biletparkingowy.setNumerMiejsca(NumerMiejsca);

                String typkarty = losoweInformacje.TypKarty();
                String czas = losoweInformacje.Czas();
                String data = losoweInformacje.Data();
                long numerkarty = losoweInformacje.NumerKarty();


                System.out.println("\t\t== Bilet Parkingowy ==\n" +
                        "  Numer Samochodu: " + samochod.NumerRejestracyjny +
                        "  Kolor Samochodu: " + samochod.KolorSamochodu +
                        "  Marka: " + samochod.Marka +
                        "\nCzas Parkowania: " + czas +
                        "  Data: " + data +
                        "\nNumer Miejsca: " + miejsceParkingowe.NumerMiejsca + "\n"
                );

                przypisanemiejscalist.add(biletparkingowy);
                System.out.println(przypisanemiejscalist.size());
            } else if (size == 4) {
                int miejscepostojowe = miejsceParkingowe.si();
                if (miejscepostojowe == 10) {
                    System.out.println("Nie ma samochodu.");
                    continue;
                } else {
                    System.out.print("Wpisz numer swojego samochodu: ");
                    String numer = scan.nextLine();
                    SkanBiletu skanbiletu = new SkanBiletu();
                    ObliczCzas obliczczas = new ObliczCzas();
                    Platnosc platnosc = new Platnosc();

                    for (BiletParkingowy bp : przypisanemiejscalist) {
                        String numersamochodu = bp.getPrzypisanieSamochodu().getNumerRejestracyjny();
                        int item = skanbiletu.sprawdznumer(numer, numersamochodu);
                        if (item == 0) {
                            continue;
                        } else if (item == 1) {
                            int miejsce = przypisanemiejscalist.indexOf(bp);
                            String datawyjscia = losoweInformacje.DataWyjscia();
                            String czaswyjscia = losoweInformacje.CzasWyjscia();
                            String wprowadzdate = przypisanemiejscalist.get(miejsce).getData();
                            String wprowadzgodzine = przypisanemiejscalist.get(miejsce).getCzas();

                            int czas[] = obliczczas.KalkuratorCzasu(wprowadzdate, datawyjscia, wprowadzgodzine, czaswyjscia);
                            float ilosc = platnosc.LacznaKwota(czas[0], czas[1]);
                            System.out.println("\n\t\t=== Twoje informacje dotyczace parkowania ===\n" +
                                    "Numer Samochodu: " + przypisanemiejscalist.get(miejsce).getPrzypisanieSamochodu().getNumerRejestracyjny() +
                                    "  Kolor Samochodu: " + przypisanemiejscalist.get(miejsce).getPrzypisanieSamochodu().getKolorSamochodu() +
                                    "  Marka Samochodu: " + przypisanemiejscalist.get(miejsce).getPrzypisanieSamochodu().getMarka() +
                                    "\nCzas Parkingowy: " + przypisanemiejscalist.get(miejsce).getCzas() +
                                    "     Wyjscie Czas: " + czaswyjscia +
                                    "\nData Parkignowa: " + przypisanemiejscalist.get(miejsce).getData() +
                                    "      Wyjsie Data: " + datawyjscia +
                                    "Miejsce Postojowe: " + przypisanemiejscalist.get(miejsce).getNumerMiejsca() +
                                    "\nCzas Ogolny: " + czas[0] + " Godzina " + czas[1] + " Minuta " +
                                    "\nKoszt Ogolny: " + ilosc + "zloty\n"
                            );

                            miejsceParkingowe.WolneMiejsce(przypisanemiejscalist.get(miejsce).getNumerMiejsca());
                            przypisanemiejscalist.remove(miejsce);

                            break;
                        }
                    }
                }
            } else if (size == 6) {
                System.out.println("Wszystkie infomracje o samochodzie: \n");
                for (BiletParkingowy bp : przypisanemiejscalist) {
                    System.out.println("\nNumer Samochodu: " + bp.getPrzypisanieSamochodu().getNumerRejestracyjny() +
                            "  Kolor Samochodu: " + bp.getPrzypisanieSamochodu().getKolorSamochodu() +
                            "  Marka Samochodu: " + bp.getPrzypisanieSamochodu().getMarka() +
                            "\nCzas Parkingowy: " + bp.getCzas() + "   Data:  " + bp.getData() +
                            "Mijesce Postojowe: " + bp.getNumerMiejsca()
                    );
                }
                miejsceParkingowe.spra();
                System.out.println();
            }

        }
    }
}
