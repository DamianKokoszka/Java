package com.javafee.java.lessons.lesson20.dane;

public class ADanych {
    private String name;
    private Integer id;
    private String city;

    public ADanych(String name,Integer id,String city){
        this.name = name;
        this.id = id;
        this.city = city;
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
        return name + "," +  id + "," + city;
    }
}
