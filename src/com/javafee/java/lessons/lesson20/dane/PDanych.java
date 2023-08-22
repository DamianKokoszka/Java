package com.javafee.java.lessons.lesson20.dane;

public class PDanych {
    private String name;
    private Integer id;
    private String city;
    private int age;

    public PDanych(String name,Integer id,String city,int age){
        this.name = name;
        this.id = id;
        this.city = city;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," +  id + "," + city+ "," + age ;
    }
}
