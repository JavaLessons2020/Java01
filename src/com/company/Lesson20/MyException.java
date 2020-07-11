package com.company.Lesson20;

import java.util.Scanner;

public class MyException extends Exception {
    int first, second;


    public MyException(int first, int second) {

        if (second == 0) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Не делите на ноль");
            }
        }

    }
}

class Run {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        try {
            //throw new NullPointerException();
            throw new MyException(a, b);
        } catch (MyException e) {
            e.printStackTrace();
        }
        System.out.println("TEST");

    }
}