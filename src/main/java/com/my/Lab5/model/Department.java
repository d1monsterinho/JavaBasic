package com.my.Lab5.model;

import java.util.List;

public class Department {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department() {}

    public Department(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups;
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

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println(groups);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;
        return name.equals(that.name) && head.equals(that.head) && groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + head.hashCode();
        result = 31 * result + groups.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", head=" + head +
                ", groups=" + groups +
                '}';
    }
}
