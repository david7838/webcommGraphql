package com.example.resolver;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.dao.EmployeeDao;
import com.example.domain.Employee;

@Component
public class EmployeeQueryResolver implements GraphQLQueryResolver{

	private EmployeeDao employeeDao;
	
	
	
	public EmployeeQueryResolver(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	//這邊用於mapping graphqls中定義的employee(id: ID!)方法
	public Employee employee(Integer id) {
		Optional<Employee> a = employeeDao.findById(id);
		
		if(a.isPresent()) {
			return a.get();
		}
		return null;
	}
	//這邊用於mapping graphqls中定義的employees方法
	public List<Employee>employees(){
		
		return employeeDao.findAll();
	}
}
