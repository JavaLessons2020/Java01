package com.company.Lesson12.OOP;

import com.company.Lesson9.algorimms.BubbleSort;

import java.util.List;

import java.lang.Object;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle();//создание обьекта Circle

        circle.printCircle();

        circle.x = 12;
        circle.y = 20;
        circle.r = 10;

        circle.printCircle();
        circle.moveCircle(5, 10);
        circle.printCircle();

        Circle circle1  = new Circle();
        circle1.printCircle();
        circle1.r = 5;
        circle1.zoomCircle(1.5);
        circle1.printCircle();
    }
}
