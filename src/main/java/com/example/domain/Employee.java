package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {

   @Id
   @GeneratedValue
   @EqualsAndHashCode.Include
   private Integer id;

   private String firstName;
   
   private String lastName;
   
   private String position;
   
   private int salary;
   
   private int age;
   
   @Column(name = "department_id")
   private Integer departmentId;
   
   @Column(name = "organization_id")
   private Integer orgnaizationId;
   
}
