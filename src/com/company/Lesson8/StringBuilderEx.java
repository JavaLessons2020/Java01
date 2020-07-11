package com.company.Lesson8;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder stringB = new StringBuilder("Hello");//изменяемая строка
        System.out.println(stringB.capacity());
        System.out.println(stringB.length());

        stringB.append(" World")
                .append(1)
                .append(12.3)
                .insert(5, " & ")
                .delete(5, 7)
                .delete(12, 17);
        String string = stringB.toString();
        stringB.replace(6, 12, "Java");
                //.reverse();
        //stringB.setLength(70);
        stringB.append("askdkalskdla;alsdkl;alsdk4564645645");
        stringB.append("145454");
        System.out.println(stringB.length());
        stringB.trimToSize();
        System.out.println(stringB.capacity());
        System.out.println(stringB);
    }
}
