package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
