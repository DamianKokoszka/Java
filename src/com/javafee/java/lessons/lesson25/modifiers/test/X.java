package com.javafee.java.lessons.lesson25.modifiers.test;

import com.javafee.java.lessons.lesson25.modifiers.BallPen;

public class X extends BallPen {

    public X(String color, String manufacturer) {
        super(color, manufacturer);
    }
    public void test(){
        System.out.println(manufacturer);
    }
}
