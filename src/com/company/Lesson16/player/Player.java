package com.company.Lesson16.player;

public class Player {
    private String firstName;
    private String lastName;

    private ToyCar toyCar;

    //private ToyCar[]toyCar;//создание ссылки типа ToyCar

//    public ToyCar[] getToyCar() {
//        return toyCar;
//    }
//
//    public Player(ToyCar[] toyCar) {
//        this.toyCar = toyCar;
//    }

//    public void setToyCar(ToyCar[] toyCar) {
//        this.toyCar = toyCar;
//    }

        public Player() {
        toyCar = new ToyCar(0,0);
    }

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void start(int dist){
        toyCar.start(dist);
    }

    public String getFirstName() {
        int a = 0;

        System.out.println(a);        
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ToyCar getToyCar() {
        return toyCar;
    }

    public void setToyCar(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", toyCar=" + toyCar +
                '}';
    }
}
