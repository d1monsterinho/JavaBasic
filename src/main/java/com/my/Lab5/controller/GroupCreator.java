package com.my.Lab5.controller;

import com.my.Lab5.model.Group;
import com.my.Lab5.model.Student;

import java.util.List;

public class GroupCreator {
    public static Group createGroup(String name, Student head, Student... students) {
        return new Group(name, head, StudentCreator.createStudentList(students));
    }

    public static List<Group> createGroupList(Group... groups) {
        return List.of(groups);
    }
}
