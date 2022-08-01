package com.javafee.java.lessons.lesson1;

public class Samochod {
	private String marka;
	private String model;
	private int rocznik;
	
	public Samochod(String marka, String model, int rocznik) {
		this.marka = marka;
		this.model = model;
		this.rocznik = rocznik;
	}
	
	public Samochod() {
		System.out.println("Tworz� auto...");
	}
	
	public void jedz(int km) {
		System.out.println("Przejecha� " + km + " kilometrow");
	}
	
	public void hello() {
		System.out.println("Hello!");
	}
	
	public void dane() {
		System.out.println(model + " "  + marka + " " + rocznik);
	}
}
