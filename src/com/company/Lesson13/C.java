package com.company.Lesson13;

public class C {
    int a;

    public C(int a) {
        this.a = a;
        System.out.println("Конструктор a = " + a);
    }

    public C(String s) {
            this(12);
        System.out.println("Конструктор c параметром String");

    }

    public void C() {
        System.out.println("Метод");
    }
}
