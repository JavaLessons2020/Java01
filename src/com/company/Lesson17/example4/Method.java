package com.company.Lesson17.example4;

import java.util.ArrayList;

interface Inter<T>{
    boolean contains(T obj);
}


public class Method<T> implements Inter<T>{

    int num;
    public <T extends Number> Method(T num) {
        this.num = 0;
    }

    static <T extends Comparable<T>, V extends T> boolean arrayEqual(T[]arr1, V[]arr2){
        if(arr1.length != arr2.length){
            System.out.println("Разная длинна и тип");
            return false; 
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //String []arr1 = {"1","2","3","4","5"};//{1,2,3,4,5};
        Integer[]arr1 = {1, 2, 3};
        Integer[]arr2 = {1, 2, 3};
        boolean b = arrayEqual(arr1, arr2);
        System.out.println(b);

    }

    @Override
    public boolean contains(T obj) {
        return false;
    }
}

