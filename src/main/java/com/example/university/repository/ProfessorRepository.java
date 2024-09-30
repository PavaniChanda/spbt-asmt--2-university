package com.example.university.repository;

import com.example.university.model.*;

import java.util.List;
import java.util.ArrayList;

public interface ProfessorRepository {

    ArrayList<Professor> getProfessors();

    Professor getProfessorById(int professorId);

    Professor addProfessor(Professor professor);

    Professor updateProfessor(int professorId, Professor professor);

    void deleteProfessor(int professorId);

    List<Course> getProfessorCourses(int professorId);

}

/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here