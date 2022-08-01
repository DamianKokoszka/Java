package com.javafee.java.lessons.lesson1.oop;

public class Pracownik extends PracownikCosmo {
	private int wiek;
	private double pensja;

	public Pracownik() {
		System.out.println("Wypisuje pracownika" + imie + nazwisko + wiek + pensja);
	}
	
	public Pracownik(String imie, String nazwisko, int wiek, double pensja) {
		super(imie, nazwisko);
		this.wiek = wiek;
		this.pensja = pensja;
	}
}
