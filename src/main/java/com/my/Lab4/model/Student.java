package com.my.Lab4.model;

public class Student extends Human {
    protected String firstname;
    protected String lastname;
    protected String middlename;
    protected Sex sex;

    public Student() {}

    public Student(String firstname, String lastname, String middlename, Sex sex) {
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

        Student student = (Student) o;
        return firstname.equals(student.firstname) && lastname.equals(student.lastname) && middlename.equals(student.middlename) && sex == student.sex;
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + middlename.hashCode();
        result = 31 * result + sex.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", sex=" + sex +
                '}';
    }
}
