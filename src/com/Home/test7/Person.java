package com.Home.test7;

public class Person  {
    private Integer personCode;
    private String city;
    private Fine fine;


    public Person() {
        fine = new Fine();
    }

    public Person(Integer personCode, String city, Fine fine) {
        this.personCode = personCode;
        this.city = city;
        this.fine = fine;
    }

    public Integer getPersonCode() {
        return personCode;
    }

    public void setPersonCode(Integer personCode) {
        this.personCode = personCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Fine getFine() {
        return fine;
    }

    public void setFine(Fine fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personCode=" + personCode +
                ", city='" + city + '\'' +
                ", fine=" + fine +
                '}'+ "\n";
    }

//    @Override
//    public int compareTo(Person o) {
//        return city.compareTo(o.getCity());
//    }
}
