package com.Home.test3;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Home {

    public <T> T scan(Class<T> c) {
        Scanner scanner = new Scanner(System.in);
        if (c.isAssignableFrom(Integer.class))
            return c.cast(scanner.nextInt());
        if (c == String.class)
            return (T) scanner.nextLine();
        if (c == Double.class)
            return c.cast(scanner.nextDouble());
        if (c == Float.class)
            return c.cast(scanner.nextFloat());
        return null;
    }

    public static <T> T[] scanArr(Scanner in, Class<T> clazz) {

        System.out.print("enter array size :  ");
        int arSize = in.nextInt();

        System.out.print("arr elements: ");
        T arr[] = (T[]) Array.newInstance(clazz, arSize);

        for (int i = 0; i < arSize; i++) {
            Object elem = null;
            if (clazz.isAssignableFrom(Integer.class)) {
                elem = in.nextInt();
            } else if (clazz == Double.class) {
                elem = in.nextDouble();
            } else if (clazz == Boolean.class) {
                elem = in.nextBoolean();
            } else if (clazz == String.class) {
                elem = in.next();
            }
            arr[i] = clazz.cast(elem);
        }
        return arr;
    }
}

class Run {
    public static void main(String[] args) {
        Home home = new Home();
        Scanner scanner = new Scanner(System.in);
        home.scanArr(scanner, Integer.class);
        System.out.println();


    }
}
