package com.my.Lab5.controller;

import com.my.Lab5.model.Faculty;
import com.my.Lab5.model.Human;
import com.my.Lab5.model.University;

import java.util.List;

public class UniversityCreator {
    public static University createUniversity(String name, Human head, Faculty... faculties) {
        return new University(name, head, FacultyCreator.createFacultyList(faculties));
    }

    public static List<University> createUniversityList(University... universities) {
        return List.of(universities);
    }
}
