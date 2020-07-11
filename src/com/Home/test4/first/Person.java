package com.Home.test4.first;

public class Person {
    private String name;
    private String homePhone;
    private String WorkPhone;
    private String MobilPhone;
    private String otherData;

    public Person() {
    }

    public Person(String name, String homePhone, String workPhone, String mobilPhone, String otherData) {
        this.name = name;
        this.homePhone = homePhone;
        WorkPhone = workPhone;
        MobilPhone = mobilPhone;
        this.otherData = otherData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return WorkPhone;
    }

    public void setWorkPhone(String workPhone) {
        WorkPhone = workPhone;
    }

    public String getMobilPhone() {
        return MobilPhone;
    }

    public void setMobilPhone(String mobilPhone) {
        MobilPhone = mobilPhone;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", WorkPhone='" + WorkPhone + '\'' +
                ", MobilPhone='" + MobilPhone + '\'' +
                ", otherData='" + otherData + '\'' +
                '}' + "\n";
    }
}
