package com.my.Lab3.controller;

import com.my.Lab3.model.Department;
import com.my.Lab3.model.Faculty;
import com.my.Lab3.model.Human;

import java.util.List;

public class FacultyCreator {
    public static Faculty createFaculty(String name, Human head, Department... departments) {
        return new Faculty(name, head, DepartmentCreator.createDepartmentList(departments));
    }

    public static List<Faculty> createFacultyList(Faculty... faculties) {
        return List.of(faculties);
    }
}
