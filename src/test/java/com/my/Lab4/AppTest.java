package com.my.Lab4;

import com.my.Lab4.controller.*;
import com.my.Lab4.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Test
    public void testJsonSerialization() {
        List<Student> studentsList1 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("Dmytro", "Yevich", "Vitaliyovych", Sex.MALE),
                new Student("student2", "student2", "student2", Sex.FEMALE)));
        List<Student> studentsList2 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student3", "student3", "student3", Sex.MALE),
                new Student("student4", "student4", "student4", Sex.FEMALE)));
        List<Student> studentsList3 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student5", "student5", "student5", Sex.MALE),
                new Student("student6", "student6", "student6", Sex.FEMALE)));
        List<Student> studentsList4 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student7", "student7", "student7", Sex.MALE),
                new Student("student8", "student8", "student8", Sex.FEMALE)));
        List<Student> studentsList5 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student9", "student9", "student9", Sex.MALE),
                new Student("student10", "student10", "student10", Sex.FEMALE)));
        List<Student> studentsList6 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student11", "student11", "student11", Sex.MALE),
                new Student("student12", "student12", "student12", Sex.FEMALE)));
        List<Student> studentsList7 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student13", "student13", "student13", Sex.MALE),
                new Student("student14", "student14", "student14", Sex.FEMALE)));
        List<Student> studentsList8 = new ArrayList<>(StudentCreator.createStudentList(
                new Student("student15", "student15", "student15", Sex.MALE),
                new Student("student16", "student16", "student16", Sex.FEMALE)));

        List<Group> groupsList1 = new ArrayList<>(GroupCreator.createGroupList(
                new Group("123-21-1", new Student("group head 1", "group head 1", "group head 1", Sex.FEMALE), studentsList1),
                new Group("123-21-2", new Student("group head 2", "group head 2", "group head 2", Sex.MALE), studentsList2)));
        List<Group> groupsList2 = new ArrayList<>(GroupCreator.createGroupList(
                new Group("123-21-3", new Student("group head 3", "group head 3", "group head 3", Sex.FEMALE), studentsList3),
                new Group("123-21-4", new Student("group head 4", "group head 4", "group head 4", Sex.MALE), studentsList4)));
        List<Group> groupsList3 = new ArrayList<>(GroupCreator.createGroupList(
                new Group("123-21-5", new Student("group head 5", "group head 5", "group head 5", Sex.FEMALE), studentsList5),
                new Group("123-21-6", new Student("group head 6", "group head 6", "group head 6", Sex.MALE), studentsList6)));
        List<Group> groupsList4 = new ArrayList<>(GroupCreator.createGroupList(
                new Group("123-21-7", new Student("group head 7", "group head 7", "group head 7", Sex.FEMALE), studentsList7),
                new Group("123-21-8", new Student("group head 8", "group head 8", "group head 8", Sex.MALE), studentsList8)));

        List<Department> departmentsList1 = new ArrayList<>(DepartmentCreator.createDepartmentList(
                new Department("department 1", new Human("dep head 1", "dep head 1", "dep head 1", Sex.MALE), groupsList1),
                new Department("department 2", new Human("dep head 2", "dep head 2", "dep head 2", Sex.MALE), groupsList2)));
        List<Department> departmentsList2 = new ArrayList<>(DepartmentCreator.createDepartmentList(
                new Department("department 3", new Human("dep head 3", "dep head 3", "dep head 3", Sex.MALE), groupsList3),
                new Department("department 4", new Human("dep head 4", "dep head 4", "dep head 4", Sex.MALE), groupsList4)));

        List<Faculty> facultiesList = new ArrayList<>(FacultyCreator.createFacultyList(
                new Faculty("FIT", new Human("FIT head", "FIT head", "FIT head", Sex.MALE), departmentsList1),
                new Faculty("faculty 2", new Human("faculty 2 head", "faculty 2 head", "faculty 2 head", Sex.MALE), departmentsList2)));

        University oldUniversity = UniversityCreator.createUniversity("НТУ \"Дніпровська політехніка\"",
                new Human("Олександр", "Азюковський", "Олександрович", Sex.MALE), facultiesList.toArray(new Faculty[0]));

        JsonWriterReader.writeInstitution(oldUniversity);

        University newUniversity = JsonWriterReader.readInstitution();

        System.out.println(oldUniversity.equals(newUniversity));
        assertEquals(oldUniversity, newUniversity);

    }
}
