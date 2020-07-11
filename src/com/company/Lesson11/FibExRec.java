package com.company.Lesson11;

public class FibExRec {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    private static int fib(int arg) {
        if(arg==1 || arg ==2){
            return 1;
        }
        return fib(arg - 1) + fib(arg - 2);
    }
}



//132 - 2
//66 - 2
//33 - 3
//11 - 11

//2 2 3 11