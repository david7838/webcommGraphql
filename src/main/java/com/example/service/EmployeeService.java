package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	public Employee getOneEmp(Integer id) {
		
		if(id != null) {
			return employeeDao.getOne(id);
		}
		
		return null;
	}
	
	public List<Employee>getAll(){
		
		return employeeDao.findAll();
	}
	
}
