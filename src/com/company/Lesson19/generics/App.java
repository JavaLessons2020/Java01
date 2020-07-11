package com.company.Lesson19.generics;

public class App<T> {

    public <T> App() {
    }

    public <T> T met(){
        T aaa = null;
        Class<T>clazz = (Class<T>) Integer.class;

        aaa = clazz.cast(Integer.class);

        return aaa;
    }

}

class Run{
    public static void main(String[] args) {
        App<Integer> app = new App();
        app.<String>met();
    }
}
