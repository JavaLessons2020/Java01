package com.Home.test8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamExcersice {

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public Student(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student people = (Student) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    static Collection<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN)
    );

    static List<Student> ex01() {
        // TODO: Задание 1
        // Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)
        System.out.println("Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)");
        students.stream()
                .filter(s -> s.sex.equals(Sex.MAN))
                .filter(s -> s.age >= 18 && s.age <= 27)
                .forEach(System.out::println);
        System.out.println();

        return null;
    }

    static Double ex02() {
        // TODO: Задание 2
        // Найти средний возраст среди мужчин
        System.out.println("Найти средний возраст среди мужчин");
        Double middleAge = students.stream()
                .filter(s -> s.sex.equals(Sex.MAN))
                .mapToInt(Student::getAge)
                .average()
                .getAsDouble();
        System.out.println("Middle age man = " + middleAge);
        System.out.println();

        return null;
    }

    static Long ex03() {
        // TODO: Задание 3
        // Найти кол-во потенциально работоспособных
        // студентов в выборке (т.е. от 18 лет и учитывая
        // что женщины выходят в 55 лет, а мужчина в 60)
        System.out.println("Найти кол-во потенциально работоспособных студентов в выборке (т.е. от 18 лет и учитывая что женщины выходят в 55 лет, а мужчина в 60)");
        students.stream()
                //.parallel()
                .filter(s -> s.sex.equals(Sex.MAN) && s.age >= 18 && s.age <= 60 || s.sex.equals(Sex.WOMEN) && s.age >= 18 && s.age <= 55)
                .forEach(System.out::println);
        System.out.println();

        return null;

    }

    static List<Student> ex04() {
        // TODO: Задание 4
        // Отсортировать студентов по имени в обратном алфавитном порядке
        System.out.println("Отсортировать студентов по имени в обратном алфавитном порядке");
        students.stream()
                .sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();

        return null;
    }

    static Student ex05() {
        //  TODO: Задание 5
        //  найти студента с максимальным возрастом
        System.out.println("найти студента с максимальным возрастом");
        Student maxAge = students.stream()
                .max((o1, o2) -> o1.getAge().compareTo(o2.getAge()))
                .get();
        System.out.println("Student with max age - " + maxAge);
        System.out.println();
        return null;
    }

    static Student ex06() {
        // TODO: Задание 6
        // Найти студента с минимальным возрастом
        System.out.println("Найти студента с минимальным возрастом");
        Student minAge = students.stream()
                .min((o1, o2) -> o1.getAge().compareTo(o2.getAge()))
                .get();
        System.out.println("Student with min age - " + minAge);
        return null;
    }

    public static void main(String[] args) {
        // TODO: тестировать здесь
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
    }
} 
