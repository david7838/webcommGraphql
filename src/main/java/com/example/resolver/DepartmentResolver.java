package com.example.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.domain.Department;
import com.example.domain.Organization;
import com.example.service.OrganizationService;
/**
 * 主要用於解析complex bean, graphqls中的type 中的 bean (complex bean)
 * @author david_yang
 *
 */

@Component
public class DepartmentResolver implements GraphQLResolver<Department>{

	@Autowired
	OrganizationService organizationService;
	
	/**
	 * 因為department中有organization, 所以需要新增這個方法
	 * @param department
	 * @return
	 */
	public Organization getOrganization(Department department) {
		
		return organizationService.getOrganization(department.getOrganization_id());
	}
}
