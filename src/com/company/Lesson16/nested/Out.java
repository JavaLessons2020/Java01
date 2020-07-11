package com.company.Lesson16.nested;

public class Out {
    static int a;

    protected static class Nest {
        //static int a; //затенение

        void print() {
            System.out.println(a);
        }
    }
}

class Run {
    public static void main(String[] args) {
        Out out = new Out();
        Out.Nest nest = new Out.Nest();
    }
}
