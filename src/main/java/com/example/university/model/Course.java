package com.example.university.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.*;

@Entity
@Table(name = "course")
public class Course {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int courseId;

   @Column(name = "name")
   private String courseName;

   @Column(name = "credits")
   private int credits;

   @ManyToOne
   @JoinColumn(name = "professorid")
   private Professor professor;

   @ManyToMany
   @JoinTable(name = "course_student", joinColumns = @JoinColumn(name = "courseid"), inverseJoinColumns = @JoinColumn(name = "studentid"))
   @JsonIgnoreProperties("courses")
   private List<Student> students = new ArrayList<>();

   public Course() {
   }

   public int getCourseId() {
      return courseId;
   }

   public void setCourseId(int courseId) {
      this.courseId = courseId;
   }

   public String getCourseName() {
      return courseName;
   }

   public void setCourseName(String CourseName) {
      this.courseName = courseName;
   }

   public int getCredits() {
      return credits;
   }

   public void setCredits(int credits) {
      this.credits = credits;
   }

   public Professor getProfessor() {
      return professor;
   }

   public void setProfessor(Professor professor) {
      this.professor = professor;
   }

   public List<Student> getStudents() {
      return students;
   }

   public void setStudents(List<Student> students) {
      this.students = students;
   }

}

/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here