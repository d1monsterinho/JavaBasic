package com.my.Lab4.model;

import java.util.List;
import java.util.Objects;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty() {}

    public Faculty(String name, Human head, List<Department> departments) {
        this.name = name;
        this.head = head;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(departments);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faculty faculty = (Faculty) o;
        return name.equals(faculty.name) && head.equals(faculty.head) && departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + head.hashCode();
        result = 31 * result + departments.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyName='" + name + '\'' +
                ", head=" + head +
                ", departments=" + departments +
                '}';
    }
}
