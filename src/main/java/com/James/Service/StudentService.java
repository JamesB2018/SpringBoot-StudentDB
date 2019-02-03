package com.James.Service;

import com.James.Entity.Student;
import com.James.DAO.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDaoImpl studentDaoImpl;

    public Collection<Student> getAllStudents(){ //collection of students, gets collection from hashmap
        return this.studentDaoImpl.getAllStudents();
    }

    public  Student getStudentById(int id){
        return this.studentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDaoImpl.removeStudentById(id);
    }

    public void updateStudent(Student student){

       this.studentDaoImpl.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDaoImpl.insertStudentToDb(student);
    }
}
