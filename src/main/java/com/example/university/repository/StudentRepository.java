package com.example.university.repository;

import com.example.university.model.*;

import java.util.List;
import java.util.ArrayList;

public interface StudentRepository {

    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);

    List<Course> getStudentCourses(int studentId);

}

/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here