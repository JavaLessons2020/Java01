package com.company.Lesson15;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Auto car = new CarClassEx();
        //car.printCar();
        ((CarClassEx) car).printEx();
       Car car1 = new Vaz();
       car1.printInt();
       Car.hello();


    }
}
