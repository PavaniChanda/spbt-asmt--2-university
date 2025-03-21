package com.example.university.model;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "professor")
public class Professor {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int professorId;

   @Column(name = "name")
   private String professorName;

   @Column(name = "department")
   private String department;

   public Professor() {
   }

   public int getProfessorId() {
      return professorId;
   }

   public void setProfessorId(int professorId) {
      this.professorId = professorId;
   }

   public String getProfessorName() {
      return professorName;
   }

   public void setProfessorName(String professorName) {
      this.professorName = professorName;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
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