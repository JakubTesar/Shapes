package com.company.logic;

public class Rectangle extends Shape {


    public Rectangle(int a, int b) {
        super(a, b, 0, 0, 0);
    }

    @Override
    public float calculatePerimeter() {
        return a * b;
    }

    @Override
    public float calculateContent() {
        return 2 * (a + b);
    }
}
