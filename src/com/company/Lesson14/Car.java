package com.company.Lesson14;


public class Car  extends Auto{
    private  String color;
    private int sits;

    public Car() {
        color = "Gray";
        sits = 4;
    }
    public Car(String body, String color, int sits) {
        super(body);
        this.color = color;
        this.sits = sits;
    }

    //Alt + insert


    public Car(String color, int sits) {
        this.color = color;
        this.sits = sits;
    }

    @Override
    void print(String string){
        System.out.println(color +" " + sits);
    }

    @Override
    void print(int a) {
        super.print("");
        System.out.println("Car ");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSits() {
        return sits;
    }

    public void setSits(int sits) {
        this.sits = sits;
    }
}
