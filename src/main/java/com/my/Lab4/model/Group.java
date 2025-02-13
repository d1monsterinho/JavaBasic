package com.my.Lab4.model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Student head;
    private List<Student> students;

    public Group() {}

    public Group(String name, Student head, List<Student> students) {
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

    public Student getHead() {
        return head;
    }

    public void setHead(Student head) {
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
        System.out.println(students);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;
        return name.equals(group.name) && head.equals(group.head) && students.equals(group.students);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + head.hashCode();
        result = 31 * result + students.hashCode();
        return result;
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
