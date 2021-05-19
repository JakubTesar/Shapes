package com.company.logic;

public class Square extends Shape {


    public Square(int a) {
        super(a, 0, 0, 0, 0);
    }

    @Override
    public float calculateContent() {
        return a * a;
    }

    @Override
    public float calculatePerimeter() {
        return a * 4;
    }
}
