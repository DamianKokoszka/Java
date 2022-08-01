package com.javafee.java.lessons.lesson1.oop;

public class PracownikCosmo {
	protected String imie;
	protected String nazwisko;
	
	public PracownikCosmo() {
		
	}
	
	public PracownikCosmo(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}


	public void firma(String wiadomosc) {
		System.out.print("Firma Cosmo, info: " + wiadomosc);
	}
}
