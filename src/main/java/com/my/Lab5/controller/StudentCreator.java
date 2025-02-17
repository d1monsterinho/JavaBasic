package com.my.Lab5.controller;

import com.my.Lab5.model.Sex;
import com.my.Lab5.model.Student;

import java.util.List;

public class StudentCreator {
    public static Student createStudent(String firstname, String lastname, String middlename, Sex sex) {
        return new Student(firstname, lastname, middlename, sex);
    }

    public static List<Student> createStudentList(Student... students) {
        return List.of(students);
    }
}
