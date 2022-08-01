package com.javafee.java.lessons.lesson1.oop;

public class Main {
	public static void  main (String[] args) {
		Pracownik kowalski = new Pracownik();
		TeamLeader janusz = new TeamLeader("John", "Cook", 10000, true);
		Kierownik kowalczyk = new Kierownik();
		kowalski.firma("Some message");
		janusz.firma("Some message");
		kowalczyk.podwyzka(5);
		kowalczyk.firma("Some message");
		janusz.print();
	}
}
