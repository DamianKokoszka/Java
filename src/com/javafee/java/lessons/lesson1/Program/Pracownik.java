package com.javafee.java.lessons.lesson1.Program;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private int id;
	
	public Pracownik() {
	}
	public Pracownik(String imie, String nazwisko, int id) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.id = id;
	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public void setID(int id) {
		this.id = id;
	}

}
