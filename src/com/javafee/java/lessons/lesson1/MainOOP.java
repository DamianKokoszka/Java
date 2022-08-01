package com.javafee.java.lessons.lesson1;

import com.javafee.java.lessons.lesson1.oop.Kierownik;

public class MainOOP {

	public static void main(String[] args) {
		int a = 1;
		Samochod porsche = new Samochod("Porsche", "Cayene", 2022); // utworzenie obiektu (reprezentant klasy) typu Samochod
		porsche.hello();
		porsche.jedz(250);
		porsche.dane();
		
		Kierownik kowalski = new Kierownik();
	}

}
