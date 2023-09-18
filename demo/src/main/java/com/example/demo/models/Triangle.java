package com.example.demo.models;

public class Triangle {
    double a;
    double b;
    double c;
    double perimeter;
    double square;

    public Triangle() {
    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a*a + b*b);
        this.perimeter = a+b+c;
        this.square = a*b/2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
