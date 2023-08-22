package com.javafee.java.lessons.lesson25.modifiers;

public class PenOwner {
    private Pen pen;

    public PenOwner(Pen pen){
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "Mam dlugopis w kolorze" + pen.color;
    }
}
