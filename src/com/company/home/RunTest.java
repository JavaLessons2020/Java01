package com.company.home;

public class RunTest {
    public RunTest() {
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        int i;
        for(i = 0; i < 5; i += 2) {

            myArray.array[i] = myArray.fillingArray1();
        }

        for(i = 0; i < 5; ++i) {
            System.out.println(i + " " + myArray.array[i]);
        }

    }
}
