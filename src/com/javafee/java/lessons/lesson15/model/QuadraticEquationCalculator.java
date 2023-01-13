package com.javafee.java.lessons.lesson15.model;

public class QuadraticEquationCalculator {
    public Result calculate(Double a, Double b, Double c) {
        Double delta = calculateDelta(a, b, c);
        Result result = new Result();
        if (delta > 0)
            result = new Result(
                    (-b - Math.sqrt(delta)) / (2 * a),
                    (-b + Math.sqrt(delta)) / (2 * a));
        else if (delta == 0)
            result = new Result(-b / (2 * a));
        return result;
    }

    private Double calculateDelta(Double a, Double b, Double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}
