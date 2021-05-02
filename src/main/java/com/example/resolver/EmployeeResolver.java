package com.example.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.domain.Department;
import com.example.domain.Employee;
import com.example.domain.Organization;
import com.example.service.DepartmentService;
import com.example.service.OrganizationService;

@Component
public class EmployeeResolver implements GraphQLResolver<Employee>{
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	OrganizationService organizationService;
	
	public Department getDepartment(Employee employee) {
		
		return departmentService.getDepartment(employee.getDepartmentId());
		
	}
	
	public Organization getOrganization(Employee employee) {
		
		return organizationService.getOrganization(employee.getOrgnaizationId());
	}

}
