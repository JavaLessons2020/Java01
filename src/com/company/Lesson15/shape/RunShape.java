package com.company.Lesson15.shape;

public class RunShape {
    public static void main(String[] args) {
        //позднее связываение
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        Shape shape;

        shape = square;
        shape.draw();

        shape = triangle;
        shape.draw();

        shape = circle;
        shape.draw();
    }
}
