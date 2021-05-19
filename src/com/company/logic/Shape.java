package com.company.logic;

public class Shape {
    protected int a;
    protected int b;
    protected int c;
    protected int r;
    protected int v;

    public Shape(int a, int b, int c, int r, int v) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.r = r;
        this.v = v;
    }

    public float calculateContent() {
        return -1;
    }

    public float calculatePerimeter() {
        return -1;
    }

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public int getV() {
        return v;
    }
    public void setV(int v) {
        this.v = v;
    }
}
