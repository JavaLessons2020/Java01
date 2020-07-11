package com.company.Lesson14;

public class Sedan extends Car {

    public Sedan(String body, int num) {
        super(body, num);
    }

    @Override//переопределение метода
    void print(int a) {
        super.print(12);
        System.out.println("Sedan");
    }


}
