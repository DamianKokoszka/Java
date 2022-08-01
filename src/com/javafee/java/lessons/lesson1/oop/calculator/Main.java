package com.javafee.java.lessons.lesson1.oop.calculator;

public class Main {

	public static void main (String [] args) {
		int pierwszaliczba;
		int drugaliczba;
		char znak;
		
		Basic basicCalculator = new Basic();
		System.out.println(basicCalculator.addition(4.5, 4.3));
	}
}
