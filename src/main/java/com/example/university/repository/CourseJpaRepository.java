package com.example.university.repository;

import com.example.university.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {

    ArrayList<Course> findByProfessor(Professor professor);
}

/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here