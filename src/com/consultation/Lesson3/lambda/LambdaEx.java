package com.consultation.Lesson3.lambda;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;



@FunctionalInterface
interface ItStep<T> {

    boolean step(T t1, T t2);

}

class Car {

}

class Man {
    public void equal(Predicate<Car> predicate) {
        System.out.println(predicate);
    }

    public void equal(Comparator<Car> comparator) {
        System.out.println(comparator);
    }

    public void equal(ItStep<Car> step) {
        System.out.println(step);
    }
}

class Test {
    public static void main(String[] args) {
        Man man = new Man();
        man.equal((ItStep<Car>) (car1, car2) -> {
            if (car1 == car2) {
                return true;
            }
            return false;
        });
            man.equal((Predicate<Car>) (p) -> false);
            man.equal((Comparator<Car>) (o1, o2) -> 0);
        }

    }
