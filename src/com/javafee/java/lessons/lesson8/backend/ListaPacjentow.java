package com.javafee.java.lessons.lesson8.backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaPacjentow extends Pacjent{
    private Date data;
    private List<RezerwacjeW> rezerwacjeList;
    private List<Recepty> recepty;

    public ListaPacjentow(){
        this.rezerwacjeList = new ArrayList<RezerwacjeW>();
        this.recepty = new ArrayList<Recepty>();
    }
    public void setRecepty(List<Recepty> recepty){
        this.recepty = recepty;
    }
    public List<Recepty> getRecepty(){
        return recepty;
    }
    public void addRecepty(Recepty p){
        recepty.add(p);
    }
    public List<RezerwacjeW> getRezerwacjeList(){
        return rezerwacjeList;
    }
    public void setRezerwacjeList(List<RezerwacjeW> rezerwacjeList){
        this.rezerwacjeList = rezerwacjeList;
    }
    public void addRezerwacjeList(RezerwacjeW a){
        rezerwacjeList.add(a);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }
    public String adminToString(){
        return "Id" + getId() +" - " +toString();
    }
    public String toString(){
        return "Pacjent" + getImie() + getNazwisko() + "Wizyta" + getData() + getRezerwacjeList() + "Recepta"+ getRecepty();
    }
}
