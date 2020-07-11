package com.company.Lesson24.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamEx {
    static ArrayList<String> strings = new ArrayList<>();

    static {
        strings.add("aaa1");
        strings.add("aaa2");
        strings.add("aaa3");
        strings.add("bbb1");
        strings.add("bbb2");
        strings.add("bbb3");
    }

    static void collStream() {
//        for (String string : strings) {
//            System.out.println(string);
//        }
        strings.stream()
                .forEach(System.out::println);
    }

    static void collFilter() {
//        ArrayList<String> stringsA = new ArrayList<>();
//        for (String s : strings) {
//            if(s.startsWith("a")){
//                stringsA.add(s);
//            }
//        }
//        for (String s : stringsA) {
//            System.out.println(s);
//        }
        List<String> stringsA = strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        stringsA.forEach(System.out::println);


    }
    public static void main(String[] args) {
        collStream();
        System.out.println();
        collFilter();
    }
}
