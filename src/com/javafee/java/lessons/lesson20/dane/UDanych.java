package com.javafee.java.lessons.lesson20.dane;

public class UDanych {
    private String name;
    private Integer id;
    private String city;

    public UDanych(String name,Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return name + "," +  id;
    }
}
