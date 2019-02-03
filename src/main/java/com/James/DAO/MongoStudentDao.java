package com.James.DAO;

import com.James.Entity.Student;

import java.sql.Connection;
import java.util.Collection;

public class MongoStudentDao implements StudentDao {

    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void removeStudentById(int id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudentToDb(Student student) {

    }
}
