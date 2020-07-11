package com.company.Lesson13;

import java.util.Scanner;

public class RunCar {
    public static void main(String[] args) {
        Car minivan = new Car();
        Car sport = new Car(2,80,15);

        int dist = 251;
        //int range1, range2;

//        minivan.passengers = 7;
//        minivan.fuelCap = 40;
//        minivan.consumption = 25;
        //minivan.setCar(7,40,25);

//        sport.passengers = 2;
//        sport.fuelCap = 80;
//        sport.consumption = 15;
        //sport.setCar(2,80,15);

        //дальность поездки при полном баке
//        range1 = minivan.fuelCap / minivan.consumption * 100;
//        range2 = sport.fuelCap / sport.consumption * 100;

        sport.setPassengers(3);
        minivan.setPassengers(7);
        double litersM = minivan.fuelNeed(dist);
        double litersS = sport.fuelNeed(dist);
        System.out.println("Minivan pas" + minivan.getPassengers() + " range " +
                minivan.range() + " km"+ " dist " + dist + " " + litersM);
        System.out.println("Sport pas" + sport.getPassengers() + " range " +
                sport.range() + " km"+ " dist " + dist + " " + litersS);






    }
}
