package com.my.Lab5;

import com.my.Lab5.controller.UniversityCreator;
import com.my.Lab5.db.DBManager;
import com.my.Lab5.db.StudentDAO;
import com.my.Lab5.model.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Напишіть місяць народження студента:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        List<Student> students = new StudentDAO(DBManager.getConnection()).findStudentsByBirthMonth(month);
        System.out.println("Знайдені студенти:");
        System.out.println(students);
    }

    private static University createTypicalUniversity() {
        return UniversityCreator.createUniversity("НТУ \"Дніпровська політехніка\"",
                new Human("Олександр", "Азюковський", "Олександрович", Sex.MALE),
                new Faculty[]{});
    }
}
