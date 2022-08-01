package com.javafee.java.lessons.lesson1.oop;

public class TeamLeader extends PracownikCosmo {
	private double pensja;
	private boolean projekt = true;

	public TeamLeader() {
		System.out.println("Wypisz teamleader " + imie + nazwisko + pensja + projekt);
	}

	public void przypisanie() {
		projekt = !projekt;
	}

	public TeamLeader(String imie, String nazwisko, double pensja, boolean projekt) {
		super(imie, nazwisko);
		this.pensja = pensja;
		this.projekt = projekt;

	}
	
	public void print() {
		System.out.println("Wypisz teamleader " + imie + nazwisko + pensja + projekt);
	}
}
