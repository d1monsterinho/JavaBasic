package com.my.Lab4.model;

public class Student extends Human {
    public Student() {}

    public Student(String firstname, String lastname, String middlename, Sex sex) {
        super(firstname, lastname, middlename, sex);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
