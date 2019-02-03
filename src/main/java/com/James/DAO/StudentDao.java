package com.James.DAO;

import com.James.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Jennie", "Computer Science"));
                put(2, new Student(2, "Chris", "History" ));
                put(3, new Student(3, "Branden", "Games"));
                put(4, new Student(4, "Aaron", "Math Education"));
            }
        };
    }

    public Collection<Student> getAllStudents(){ //collection of students, gets collection from hashmap
        return this.students.values();
    }

    public  Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }

    public void updateStudent(Student student){

        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student); //puts student back into the database
    }


    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(), student);
    }
}
