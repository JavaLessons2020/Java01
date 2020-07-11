package com.company.Lesson26;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {

//    static <T> void consumer(T inp) {
//        System.out.println(inp);
//    }

    static void directStream() {
        System.out.format("Stream%n------%n");
        int[] arr = {1, 2, 3, 4, 5, 5, 2, 1};
        String str = "Hello";
        for (int item : arr) {
            System.out.println("item = " + item);
        }

//        IntStream.of(1,2,34);
//        LongStream;
//        DoubleStream

    }

    static List<String> stringCollection = new ArrayList<>();

    static {
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
    }

    static void collectionStream() {
        System.out.format("Collection Stream%n------%n");
//        for (String item : stringCollection) {
//            System.out.println("item = " + item);
//        }
        stringCollection.stream()
                //.forEach((String str) ->{ System.out.println(str); });
                .forEach(System.out::println);

    }

    private static void filterExample() {
        System.out.format("Filter%n------%n");
        // print string starts with 'a'

//        List<String> res = new ArrayList<>();
//        for (String item : stringCollection) {
//            if (item.startsWith("a")) {
//                res.add(item);
//            }
//        }
//        for (String item : res) {
//            System.out.println("item = " + item);
//        }
        List<String> stringsA = stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        stringsA.forEach(System.out::println);

    }

    private static void sortExample() {
        System.out.format("%nSorted%n------%n");
//        // sort string starts with 'a' and print
//        List<String> res = new ArrayList<>();
//        for (String item : stringCollection) {
//            if (item.startsWith("a")) {
//                res.add(item);
//            }
//        }
//        res.sort((a, b) -> a.compareTo(b));
//        for (String item : res) {
//            System.out.println("item = " + item);
//        }
        stringCollection.stream()
                .filter(s -> s.startsWith("a"))
                .sorted()
                .forEach(System.out::println);
    }

    private static List<Integer> mapExample() {
        System.out.format("%nMap%n---%n");
        // find string length 4 chars, get last char, convert to int, get list
        //List<Integer> intCollection = new ArrayList<>();

//        for (String item : stringCollection) {
//            if (item.length() == 4) {
//                intCollection.add(Integer.valueOf(item.substring(3)));
//            }
//        }

        List<Integer> intCollection = stringCollection.stream()
                .filter(s -> s.length() == 4)//промежуточный метод
                .map(s -> s.substring(3))//метод класса стрим - изменяет элементы коллекции
                .map(Integer::valueOf)
                .collect(Collectors.toList());//терминальный метод

        intCollection.forEach(System.out::println);//терминальный метод

        return intCollection;
    }

    private static void distinctExample(List<? extends Integer> intCollection) {
        System.out.format("%nDistinct%n--------%n");
//        List<Integer> distinctList = new ArrayList<>();
//        for (Integer item : intCollection) {
//            if (!distinctList.contains(item)) {
//                distinctList.add(item);
//            }
//        }
        List<Integer> distinctList = intCollection.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        distinctList.forEach(s -> System.out.print(s + " "));
    }

    private static void matchExample() {
        System.out.format("%nMatch%n-----%n");

        boolean isAnyWordStartA = stringCollection.stream()
                .anyMatch(s -> s.startsWith("a"));
        boolean isAllWordStartA = stringCollection.stream()
                .allMatch(s -> s.startsWith("a"));
        boolean isNoneWordStartA = stringCollection.stream()
                .noneMatch(s -> s.startsWith("a"));
        ;

        System.out.println("isAnyWordStartA: " + isAnyWordStartA);
        System.out.println("isAllWordStartA: " + isAllWordStartA);
        System.out.println("isNoneWordStartA: " + isNoneWordStartA);
//        for (String item : stringCollection) {
//            if (item.startsWith("a")) {
//                isAnyWordStartA = true;
//                break;
//            }
//        }
//        System.out.println("isAnyWordStartA: " + isAnyWordStartA);
//
//
//        for (String item : stringCollection) {
//            if (!item.startsWith("a")) {
//                isAllWordStartA = false;
//                break;
//            }
//        }
//        System.out.println("isAllWordStartA: " + isAllWordStartA);
//
//
//        System.out.println("isNoneWordStartA: " + isNoneWordStartA);
    }

    private static void minMaxExample(List<Integer> intCollection) {
        System.out.format("%nMin/Max%n-------%n");

//        Integer maxInt = intCollection.get(0);
//        for(Integer item: intCollection) {
//            if(Integer.compare(item, maxInt) > 0) {
//                maxInt = item;
//            }
//        }
//
//        System.out.println("max: " + maxInt);
//
//        Integer minInt = intCollection.get(0);
//        for(Integer item: intCollection) {
//            if(Integer.compare(item, minInt) < 0) {
//                minInt = item;
//            }
//        }
//
//       System.out.println("min: " + minInt);

        //Вариант 1
//        Optional<Integer> maxOptional = intCollection.stream().max((a, b) -> a - b);
//        Integer max = 0;
//        if (maxOptional.isPresent()) {
//            max = maxOptional.get();
//        }
//        System.out.println("max = " + max);
//        //Вариант 2
        Optional<Integer> optional = Optional.of(1);
//        Integer max = intCollection.stream()
//                .max((a, b) -> a - b)
//                .get();
        //Вариант3
        Integer maxInt = optional.orElse(0);
        System.out.println("max = " + maxInt);

        Integer max = intCollection.stream()
                .mapToInt(Integer::valueOf)
                .max()
                .orElse(0);
        System.out.println("max = " + max);
    }

    private static void countExample(List<Integer> intCollection) {
        System.out.format("%nCount%n-----%n");
        // count only even number

//        for(Integer item: intCollection) {
//            if(item % 2 == 0) {
//                countEven++;
//            }
//        }

//        System.out.println("count: " + countEven);
        long count = intCollection.stream()
                .filter(i -> i % 2 == 0)
                .count();
        System.out.println("count = " + count);
    }

    private static void averageExample(List<Integer> intCollection) {
        System.out.format("%nAverage%n-------%n");
//        double average = 0;
//        for(Integer item: intCollection) {
//            average += item;
//        }
//        average /= intCollection.size();

        //Вариант1
        double average = intCollection.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();
        //Вариант2
        IntSummaryStatistics intSummaryStatistics = intCollection.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();


        System.out.println("average = " + intSummaryStatistics.getAverage());
        System.out.println("sum = " + intSummaryStatistics.getSum());

    }

    private static void reduceExample(List<Integer> intCollection) {
        System.out.format("%nReduce%n-------%n");
//        int sum = 0;
//        for(Integer item: intCollection) {
//            sum = sum + item;
//        }
//        System.out.println("sum: " + sum);
        Integer sum = intCollection.stream()
                .reduce((a, item) -> a + item)
                //.reduce(0, (a, item)-> a + item);
                .get();
    }

    public static void main(String[] args) {

        directStream();

        collectionStream();

        // --- Intermediate operations ---
        // Filter
        filterExample();

        // Sorted
        sortExample();

        // Map
        List<Integer> intCollection = mapExample();


        // Distinct
        distinctExample(intCollection);

        // --- Terminal operations ---
        // Match
        matchExample();

        // Max, Min
        minMaxExample(intCollection);

        // Count
        countExample(intCollection);

        // Average	(terminal operation)
        averageExample(intCollection);

        // Reduce (terminal operation)
        reduceExample(intCollection);

        // Parallel Streams
        parallelStreamsExample();
    }

    private static void parallelStreamsExample() {
        int max = 300_000_0;

        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        System.out.format("%nSequence%n-------%n");
        List<String> cpy = new ArrayList<>(values);
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);
        //Instant start = Instant.now();
        long count = cpy.stream()
                .filter((o1) -> o1.contains("a"))
                .sorted()
                .count();
        long end = System.currentTimeMillis();
        System.out.println("end = " + end);
        System.out.println("count = " + count);
        //Instant end = Instant.now();
        //long seq = Duration.between(start, end).getNano();
        long seq = end - start;
        System.out.println("seq: " + seq);

        System.out.format("%nParallel%n-------%n");
        long start1 = System.currentTimeMillis();
        System.out.println("start1 = " + start1);
        //start = Instant.now();
        long count1 = values.parallelStream()
                .filter((o1) -> o1.contains("a"))
                .sorted()
                .count();
        long end1 = System.currentTimeMillis();
        System.out.println("end1 = " + end1);
        System.out.println("count1 = " + count1);
        //end = Instant.now();
        //long par = Duration.between(start, end).getNano();
        long par = (end1 - start1);
        System.out.println("\npar: " + par);
        System.out.println("seq/par: " + ((double) seq / par));
        System.out.println("par/seq: " + ((double) par/ seq));
    }
}
