package com.company.logic;

public class Triangle extends Shape{

    public Triangle(int a, int b, int c, int v) {
        super(a, b, c, 0, v);
    }

    @Override
    public float calculateContent() {
        return (c * v) / 2;
    }

    @Override
    public float calculatePerimeter() {
        return  a + b + c;
    }
}
