package com.consultation.Lesson2;

import java.util.ArrayList;
import java.util.LinkedList;

class A <T>{
    public<T> void print(T item) {
        System.out.println(item);
    }
}


public class Application<V, P> {
    V test1;
    P test2;
    private Object o;

    public <V extends Integer, P extends Number> void sum(V num1, P num2) {

        System.out.println(num1.intValue() + num2.intValue());
        System.out.println();
    }

    public <V extends Character, P extends Character> void sum(V num1, P num2) {

        System.out.println(num1.toString() + num2.toString());
        System.out.println();
    }

    public <V extends Character, P extends Number> void sum(V num1, P num2) {

        System.out.println(num1.toString() + num2.toString());
        System.out.println();
    }


    public <V, P> void sum(V num1, P num2, Class<?> clazz) {
        if (String.class == num1 & String.class == num2) {
            String res = (String) num1 + (String) num2;
        }
    }


//    public <M> Application(M test) {
//        //this.test = test;
//    }

//    public <T, K> V method(T variable1, K variable2) {
//        return test;
//    }

//    public <T extends V> void question(Application<T> application){
//        System.out.println(application);
//    }


}

abstract class Test {
    public static void main(String[] args) {
//        Application application = new Application<>();
//        Application<String> strApplication = new Application<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Application<String, String> application = new Application<>();
        application.sum("Helo", "World", String.class);

        A<?> a = new A<>();
        a.print(12);


        //A<String>a = new A<>();
        ArrayList<?> arrayList = new ArrayList<>();

//        arrayList.add("Hello");
//        arrayList.add(12);
//        arrayList.add(12.0);


        for (Object o : arrayList) {
            System.out.println(o);
        }

        //application.method(arrayList, application);
        //application.question(strApplication);


    }
}

