package com.javafee.java.lessons.lesson25.modifiers;

public class BallPen extends Pen{
    protected String manufacturer;

    public BallPen(String color,String manufacturer){
        super(color);
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return manufacturer + " " + color;
    }
}
