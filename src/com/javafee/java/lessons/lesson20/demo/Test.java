package com.javafee.java.lessons.lesson20.demo;

public class Test {
    private String name;
    private Integer id;

    public Test(String name, Integer id) {
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

    @Override
    public String toString() {
        return id + "," + name;
    }
}
