package com.company.Lesson14;

public  class Auto {
    private String body;
    //final static int num = 12;


    public Auto() {
    }

    public Auto(String body) {
        this.body = body;
    }

    void print(String a) {
        System.out.println("Hello Auto");
    }

    void print(int a) {
        System.out.println(" ");
    }

    final void hello() {

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
