package com.my.Lab3.controller;

import com.my.Lab3.model.Group;
import com.my.Lab3.model.Human;
import com.my.Lab3.model.Student;

import java.util.List;

public class GroupCreator {
    public static Group createGroup(String name, Human head, Student... students) {
        return new Group(name, head, StudentCreator.createStudentList(students));
    }

    public static List<Group> createGroupList(Group... groups) {
        return List.of(groups);
    }
}
