package com.javafee.java.lessons.lesson8.backend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OdwolywanieW extends Pacjent{
    private Date data;
    private List<OdwolywanieW> odwolywanieList;
    private List<Recepty> recepty;

    public OdwolywanieW(){
        this.odwolywanieList = new ArrayList<OdwolywanieW>();
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
    public List<OdwolywanieW> getOdwolywanieList(){
        return odwolywanieList;
    }
    public void setOdwolywanieList(List<OdwolywanieW> odwolywanieList){
        this.odwolywanieList = odwolywanieList;
    }
    public void addOdwolywanieList(OdwolywanieW a){
        odwolywanieList.add(a);
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
        return "Pacjent" + getImie() + getNazwisko() + "Wizyta" + getData() + getOdwolywanieList() + "Recepta"+ getRecepty();
    }
}
