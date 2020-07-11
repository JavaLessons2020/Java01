package com.company.Lesson14.constr;

public class A  {
    public A() {
        System.out.println("A");
    }

    void printA(){
        System.out.println("метод A");
    }

}

class B extends A{
    public B() {
        System.out.println("B");
    }

    void printB(){
        System.out.println("метод B");
    }
}

class C extends B{
    public C() {
        System.out.println("C");
    }

    void printC(){
        System.out.println("метод C");
    }
}

class D{
    void printD(){
        System.out.println("метод D");
    }
}

class Go{
    public static void main(String[] args) {
      A a = new C();//преобразование типов
      //b.printC();//не видим методы в наследниках
        ((C)a).printC();//кастинг

    }
}
