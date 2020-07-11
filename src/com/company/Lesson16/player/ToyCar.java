package com.company.Lesson16.player;

public class ToyCar {
    private double x = 0;
    private double y = 0;
    protected double course = 0;
    private Player player;



    public ToyCar(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void start(int distance){
        x = x + distance*Math.cos(course/180*Math.PI);
        y = y + distance*Math.cos(course/180*Math.PI);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setCourse(double course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "ToyCar{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
