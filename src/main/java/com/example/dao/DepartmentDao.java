package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
