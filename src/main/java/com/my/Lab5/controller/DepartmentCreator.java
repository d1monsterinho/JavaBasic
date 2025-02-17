package com.my.Lab5.controller;

import com.my.Lab5.model.Department;
import com.my.Lab5.model.Group;
import com.my.Lab5.model.Human;

import java.util.List;

public class DepartmentCreator {
    public static Department createDepartment(String name, Human head, Group... groups) {
        return new Department(name, head, GroupCreator.createGroupList(groups));
    }

    public static List<Department> createDepartmentList(Department... departments) {
        return List.of(departments);
    }

}
