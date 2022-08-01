package com.javafee.java.lessons.lesson1.Program;

public class Zadanie {
	private int id;
	private String nazwa;
	private String opis;
	private String status;
	private Pracownik przypisanaosoba;

	public Zadanie() {

	}

	public Zadanie(int id, String nazwa, String opis, String status, Pracownik przypusanaosoba) {

	}

	public void setID(int id) {
		this.id = id;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setPracownik(Pracownik przypisanaosoba) {
		this.przypisanaosoba = przypisanaosoba;
	}

	public int getID() {
		return id;
	}

	public String getNazwa() {
		return nazwa;
	}

	public String getOpis() {
		return opis;
	}

	public String getStatus() {
		return status;
	}

	public Pracownik getPracownik() {
		return przypisanaosoba;
	}

	public void zwieszProgres() {
		if(status.equals("ON HOL"))
			status = "TODO";
		else if(status.equals("TODO"))
			status = "DOING";
	}
	
	public void zmiejszaProges() {
		if(status.equals("DOING"))
			status = "TODO";
		else if(status.equals("TODO"))
			status = "ON HOL";
	}
}
