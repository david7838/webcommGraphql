package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DepartmentDao;
import com.example.domain.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao departmentDao;
	
	public Department getDepartment(Integer departmentId) {
		
		return departmentDao.findById(departmentId).orElse(null);
		
	}
}
