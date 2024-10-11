package com.iit.oop.week3;

public class Teacher extends Person {
    private double Salary;


    /**
     * Constructor for the teacher class
     * @param name name of the constructor
     * @param dob date of birth
     * @param salary monthly salary
     */
    public Teacher(String name, String dob, double salary) {
        super(name, dob);
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name:" + getName() +
                "dob:" + getDob() +
                "salary:" + Salary +
                '}';

    }
}
