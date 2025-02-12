package com.my.Lab3;

import com.my.Lab3.controller.UniversityCreator;
import com.my.Lab3.model.Faculty;
import com.my.Lab3.model.Human;
import com.my.Lab3.model.Sex;
import com.my.Lab3.model.University;

public class Main {
    public static void main(String[] args) {

    }

    private static University createTypicalUniversity() {
        return UniversityCreator.createUniversity("НТУ \"Дніпровська політехніка\"",
                new Human("Олександр", "Азюковський", "Олександрович", Sex.MALE),
                new Faculty[]{});
    }
}
