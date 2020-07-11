package com.company.Lesson11;

public class StackRec {

    private static void a(){
        System.out.println("A");
        b();
        System.out.println("return A");
    }
    private static void b(){
        System.out.println("B");
        c();
        System.out.println("return B");
    }
    private static void c(){
        System.out.println("C");
        return;
        //a(); - косвеная рекрсия
    }

    public static void main(String[] args) {
        a();
        System.out.println("After C");

    }
}
