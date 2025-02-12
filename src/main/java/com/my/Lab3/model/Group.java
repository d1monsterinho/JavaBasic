package com.my.Lab3.model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head, List<Student> students) {
        this.name = name;
        this.head = head;
        this.students = students;
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

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(head, group.head) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, students);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", head='" + head + '\'' +
                ", students=" + students +
                '}';
    }
}
