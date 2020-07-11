package com.company.Lesson20;

import java.util.NoSuchElementException;

public class ExceptionExThrow {
    public static void test() {
        try {
            throw new ArithmeticException("test exception");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            try {
                throw new NoSuchElementException();// nextInt()
            } catch (NoSuchElementException ex) {
                ex.printStackTrace();
                System.out.println("Внутреный перехват");
            }
        }
    }

    public static void test1() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void main(String[] args) throws InterruptedException {
        //test();
        test1();


//        try {
//            test();
//        }catch (ArithmeticException e){
//            System.out.println("Повторный перехват");
//        }

        System.out.println("Happy end");
    }
}
