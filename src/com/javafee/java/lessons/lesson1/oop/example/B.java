package com.javafee.java.lessons.lesson1.oop.example;

public class B extends A {
	public B(String message) {
		super(message);
		System.out.println("B created!");
	}
	
	public B() {
		super("Message from B");
	}
	
	public void b() {
		System.out.println("b");
	}
}
