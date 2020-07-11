package com.company.Lesson17.example1;

public class GenericsEx <T,V> {//K - key V -value
    T first;//обьект типа T
    V second;

    public GenericsEx(T first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "GenericsEx{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}




class Run{
    public static void main(String[] args) {
        GenericsEx<Integer, String> ex = new GenericsEx<>(123, "Hello");
        System.out.println("ex = " + ex);

        GenericsEx<String, Integer>str = new GenericsEx<>("Hello", 34);
        System.out.println("str = " + str);


        Type type = new Type(12, "Hello", 12.4, 'C');
        GenericsEx<Type,Type>typeEx = new GenericsEx<>(type, type);
        System.out.println("typeEx = " + typeEx);
    }
}
