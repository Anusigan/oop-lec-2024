package com.iit.oop.week3;

public class Person {
    private String name;
    private String dob;

    /**Default Constructor **/
    public Person() {
        super();
        this.name = "Alex";
        this.dob = "1st April";
    }


    /**Parameterized Constructor**/
    public Person(String name, String dob) {
        super();
        this.name = name;
        this.dob = dob;

    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
