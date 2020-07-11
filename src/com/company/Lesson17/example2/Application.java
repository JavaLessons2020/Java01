package com.company.Lesson17.example2;

import com.company.Lesson14.constr.A;

public class Application <V extends Number, T extends V> {
   public T num;

    public Application(T num) {
        this.num = num;
    }

    double drob(){
        return num.doubleValue() - num.intValue();
    }

    @Override
    public String toString() {
        return "Application{" +
                "num=" + num +
                '}';
    }
}

class Run{
    public static void main(String[] args) {
        Application<Number,Double> app = new Application<>(12.0);


    }
}
