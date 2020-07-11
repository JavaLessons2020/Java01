package com.company.Lesson13;

public class Car {
    private int passengers;//пассажиры
    private int fuelCap;//емкость топливного бака
    private int consumption;//расход топлива л\100км

    public Car() {
        this.passengers = 4;
        this.fuelCap = 40;
        this.consumption = 7;
    }

    public Car(int passengers, int fuelCap, int consumption) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.consumption = consumption;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelCap() {
        return fuelCap;
    }

    public void setFuelCap(int fuelCap) {
        this.fuelCap = fuelCap;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int range() {
        return fuelCap / consumption * 100;
    }


    public double fuelNeed(int kilometers) {
        return (double) consumption / 100 * kilometers;
    }

    public void setCar(int pas, int fCap, int con) {
        passengers = pas;
        fuelCap = fCap;
        consumption = con;
    }
}
