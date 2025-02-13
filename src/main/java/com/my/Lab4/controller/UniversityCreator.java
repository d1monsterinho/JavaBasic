package com.my.Lab4.controller;

import com.my.Lab4.model.Faculty;
import com.my.Lab4.model.Human;
import com.my.Lab4.model.University;

import java.util.List;

public class UniversityCreator {
    public static University createUniversity(String name, Human head, Faculty... faculties) {
        return new University(name, head, FacultyCreator.createFacultyList(faculties));
    }

    public static List<University> createUniversityList(University... universities) {
        return List.of(universities);
    }
}
