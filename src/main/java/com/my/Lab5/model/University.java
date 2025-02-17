package com.my.Lab5.model;

import java.util.List;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University() {}

    public University(String name, Human head, List<Faculty> faculties) {
        this.name = name;
        this.head = head;
        this.faculties = faculties;
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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(faculties);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;
        return name.equals(that.name) && head.equals(that.head) && faculties.equals(that.faculties);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + head.hashCode();
        result = 31 * result + faculties.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", head='" + head + '\'' +
                ", faculties=" + faculties +
                '}';
    }
}
