package com.example.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Department {
   @Id
   @GeneratedValue
   @EqualsAndHashCode.Include
   private Integer id;
   
   private String name;
   
   private Integer organization_id;
   
   private Integer employee_id;
   
//   @OneToMany(mappedBy = "department")
//   private Set<Employee> employees;
   
//   private Set<Integer> employeeIds;
   
//   @ManyToOne(fetch = FetchType.LAZY)
//   private Organization organization;
   
//   private Integer organizationId;

}
