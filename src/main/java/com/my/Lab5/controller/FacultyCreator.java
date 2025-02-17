package com.my.Lab5.controller;

import com.my.Lab5.model.Department;
import com.my.Lab5.model.Faculty;
import com.my.Lab5.model.Human;

import java.util.List;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head, Department... departments) {
        return new Faculty(name, head, DepartmentCreator.createDepartmentList(departments));
    }

    public static List<Faculty> createFacultyList(Faculty... faculties) {
        return List.of(faculties);
    }
}
