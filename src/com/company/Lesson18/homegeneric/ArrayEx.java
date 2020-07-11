package com.company.Lesson18.homegeneric;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayEx<T> {

    T elem;

    public T[] scan(Scanner in, Class<T> clazz) {
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        T[] arr = (T[]) Array.newInstance(clazz, size);
        for (int i = 0; i <arr.length; i++) {
            Object elem = null;
            if (clazz.isAssignableFrom(Integer.class)) {
                elem = in.nextInt();
            } else if (clazz == Double.class) {
                elem = in.nextDouble();
            }else if(clazz == String.class){
                elem = in.nextDouble();
            }
            arr[i] = clazz.cast(elem);
        }
        return arr;
    }

}
