package com.javafee.java.lessons.lesson15.model;

import java.util.Objects;

public class Result {
    private Double x1 = null;
    private Double x2 = null;

    public Result() {
    }

    public Result(Double x1, Double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Result(Double x1) {
        this.x1 = x1;
    }

    @Override
    public String toString() {
        return !Objects.isNull(x2) ? "x1 = " + x1 + ", x2 = " + x2 :
                !Objects.isNull(x1) ? "x1 = x2 = " + x1 : "";
    }
}
