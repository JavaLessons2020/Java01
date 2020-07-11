package com.company.Lesson16.nest_inter;

public class App1 {

    public interface Nested{
        void print();
    }
}

class App2 implements App1.Nested{

    @Override
    public void print() {
        System.out.println("Реализация вложенного интерфейса");

    }
}

class Run{
    public static void main(String[] args) {
        App1.Nested nested = new App2();

        nested.print();
    }
}

