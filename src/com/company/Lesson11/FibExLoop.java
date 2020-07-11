package com.company.Lesson11;

public class FibExLoop {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    private static int fib(int arg) {
        int[] data = new int[arg + 1];
        data[0] = 0;
        data[1] = 1;
        for (int i = 2; i < data.length; i++) {
            data[i] = data[i - 1] + data[i - 2];
        }
        return data[arg];
    }

}
