package com.company.Lesson18.triandle;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Point[] point = triangle.getPoint();

        Point[] p = {
                new Point(12,89),
                new Point(14,45),
                new Point(16,34),
        };
        triangle.setPoint(p);
        System.out.println(Arrays.toString(point));


    }
}
