package com.company.logic;

public class Circle extends Shape {


    public Circle(int r) {
        super(0, 0, 0, r, 0);
    }

    @Override
    public float calculatePerimeter() {
        return (float) (3.14 * (r * r));
    }

    @Override
    public float calculateContent() {
        return (float) (2 * 3.14 * r);
    }
}
