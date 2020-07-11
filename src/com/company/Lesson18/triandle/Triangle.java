package com.company.Lesson18.triandle;

public class Triangle {
    Point [] point = new Point[3];

    public Triangle() {
        for (int i = 0; i < point.length; i++) {
            point[i] = new Point(0,0);
        }
    }

    public Point[] getPoint() {
        return point;
    }

    public void setPoint(Point[] point) {
        this.point = point;
    }
}
