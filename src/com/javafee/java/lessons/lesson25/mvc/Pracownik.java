package com.javafee.java.lessons.lesson25.mvc;

public class Pracownik {
    private String PracownikImie;
    private String PracownikId;
    private String DzialPracownikow;

    public String getId(){
        return PracownikId;
    }

    public void setId(String id){
        this.PracownikId = id;
    }

    public String getName(){
        return PracownikImie;
    }

    public void setName(String name) {
        this.PracownikImie = name;
    }

    public String getDepartment(){
        return DzialPracownikow;
    }

    public void setDepartment(String Department){
        this.DzialPracownikow = Department;
    }
    public Pracownik (String name,int id){
        this.PracownikImie = name;
        this.PracownikId = String.valueOf(id);
    }

    @Override
    public String toString() {
        return "Pracownik: " + PracownikImie + PracownikId + DzialPracownikow;
    }
}