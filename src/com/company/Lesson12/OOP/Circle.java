package com.company.Lesson12.OOP;

public class Circle {
    //свойства класса
    public double x;
    public double y;
    public double r;

    public Circle() {
    }

    //методы класса
    public void printCircle() {
        System.out.println("Оксружность центр " + x + " : " + y + " радиус " + r);
    }


    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

}