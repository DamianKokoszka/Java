package com.javafee.java.lessons.lesson24.model;


import java.util.ArrayList;

public class Car {
    private int id;
    private String mark;
    private String model;
    private String description;
    private Double enginecapacity;
    private Double enginepower;
    private String enginetype;
    private Boolean fix;
    private String customer;
    ArrayList<String> repair = new ArrayList<String>();

    public Car() {

    }

    public Car(String mark, String model, String description, Double enginecapacity, Double enginepower, String enginetype, Boolean fix, String customer) {
        this.mark = mark;
        this.model = model;
        this.description = description;
        this.enginecapacity = enginecapacity;
        this.enginepower = enginepower;
        this.enginetype = enginetype;
        this.fix = fix;
        this.customer = customer;

    }

    public Car(String[] cars) {
    }

    public Car(String bmw) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Boolean getFix() {
        return fix;
    }

    public Double getEnginecapacity() {
        return enginecapacity;
    }

    public Double getEnginepower() {
        return enginepower;
    }

    public String getCustomer() {
        return customer;
    }

    public String getDescription() {
        return description;
    }

    public String getEnginetype() {
        return enginetype;
    }

    public String getModel() {
        return model;
    }

    public void setEnginecapacity(Double enginecapacity) {
        this.enginecapacity = enginecapacity;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEnginepower(Double enginepower) {
        this.enginepower = enginepower;
    }

    public void setEnginetype(String enginetype) {
        this.enginetype = enginetype;
    }

    public void setFix(Boolean fix) {
        this.fix = fix;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRepair(ArrayList<String> repair) {
        this.repair = repair;
    }

    @Override
    public String toString() {
        return "Samochody: " + " " +
                "marka: " + mark + " ," +
                "model: " + model +
                " ," + "Opis: " + description +
                " ," + "Pojemnosc silnika:" + enginecapacity +
                " ," + "Moc silnika:" + enginepower +
                " ," + "Typ silnika:" + enginetype +
                " ," + "Wypakowy:" + fix +
                " ," + "Klient: " + customer;
    }

    public Object put(int i, String audi) {

        return null;
    }
}
