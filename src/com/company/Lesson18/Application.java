package com.company.Lesson18;

import com.company.Lesson17.example1.Type;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Test test = new Test(11);

        Class<Test> clazz1 = Test.class;
        Class<? extends Test> clazz2  = test.getClass();
        //Class clazz3 = Class.forName("com/company/Lesson18/Application.java");

        Field[] fields = clazz1.getDeclaredFields();
        for (Field field : fields) {
            System.out.print(field.getType() + " ");
            System.out.println(field.getName());
            field.setAccessible(true);
            field.setInt(test, 15);
            System.out.println(field.getInt(test));
        }

        Constructor<?>[] constructors = clazz2.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType() + " ");
                System.out.println(parameter.getName());
            }
        }
    }
}

class Test{
     private int a;
     private int b;


    public Test(int a ) {
        this.a = a;
    }

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
