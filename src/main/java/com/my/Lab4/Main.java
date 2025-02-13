package com.my.Lab4;

import com.my.Lab4.controller.UniversityCreator;
import com.my.Lab4.model.Faculty;
import com.my.Lab4.model.Human;
import com.my.Lab4.model.Sex;
import com.my.Lab4.model.University;

public class Main {
    public static void main(String[] args) {

    }

    private static University createTypicalUniversity() {
        return UniversityCreator.createUniversity("НТУ \"Дніпровська політехніка\"",
                new Human("Олександр", "Азюковський", "Олександрович", Sex.MALE),
                new Faculty[]{});
    }
}
