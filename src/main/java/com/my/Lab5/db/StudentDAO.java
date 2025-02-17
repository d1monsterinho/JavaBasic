package com.my.Lab5.db;

import com.my.Lab5.model.Sex;
import com.my.Lab5.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO extends DAO<Student> {

    public StudentDAO(Connection dataDomainConnection) {
        super(dataDomainConnection);
    }

    public static class FindQueries {
        final static String FIND_STUDENT_BY_ID = "SELECT * FROM students WHERE id = ?";
        final static String FIND_STUDENT_BY_BIRTH_MONTH = "SELECT * FROM students WHERE birth_month = ?";
    }

    public Student findStudentById(int id) {
        Student student = new Student();
        try (PreparedStatement ps = dataDomainConnection.prepareStatement(FindQueries.FIND_STUDENT_BY_ID)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            student.setFirstname(rs.getString(2));
            student.setLastname(rs.getString(3));
            student.setMiddlename(rs.getString(4));
            student.setSex(Sex.valueOf(rs.getString(5)));
            student.setBirthMonth(rs.getString(6));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return student;
    }

    public List<Student> findStudentsByBirthMonth(String birthMonth) {
        List<Student> students = new ArrayList<>();
        try (PreparedStatement ps = dataDomainConnection.prepareStatement(FindQueries.FIND_STUDENT_BY_BIRTH_MONTH)) {
            ps.setString(1, birthMonth);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setFirstname(rs.getString(2));
                student.setLastname(rs.getString(3));
                student.setMiddlename(rs.getString(4));
                String sex = rs.getString(5);
                Sex studentSex = null;
                if (sex.equals("M")) studentSex = Sex.MALE;
                else studentSex = Sex.FEMALE;
                student.setBirthMonth(rs.getString(6));
                students.add(student);
            }

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return students;
    }

    @Override
    public void create(Student dto) {

    }
}
