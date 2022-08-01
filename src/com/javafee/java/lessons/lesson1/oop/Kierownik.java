package com.javafee.java.lessons.lesson1.oop;

public class Kierownik extends PracownikCosmo {
	private int wiek;
	private double pensja;

	public Kierownik() {
		System.out.println("Wypisuje kierownika " + imie + nazwisko + wiek + pensja);
	}

	public void podwyzka(int procent) {
		double kwotaPodwyzki = pensja * (procent / 100);
		pensja += kwotaPodwyzki;
	}

	public Kierownik(String imie, String nazwisko, int wiek, double pensja) {
		super (imie, nazwisko);
		this.wiek = wiek;
		this.pensja = pensja;
	}
}
