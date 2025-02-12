package com.my.Lab3.model;

import java.util.Objects;

public class Human {
    protected String firstname;
    protected String lastname;
    protected String middlename;
    protected Sex sex;

    public Human(String firstname, String lastname, String middlename, Sex sex) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.sex = sex;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstname, human.firstname) && Objects.equals(lastname, human.lastname) && Objects.equals(middlename, human.middlename) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, middlename, sex);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", sex=" + sex +
                '}';
    }
}
