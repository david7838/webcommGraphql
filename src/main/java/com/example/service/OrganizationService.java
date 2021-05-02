package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrganizationDao;
import com.example.domain.Employee;
import com.example.domain.Organization;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;
	
	public Organization getOrganization(Integer organizationId) {
		
		return organizationDao.findById(organizationId).orElse(null);
		
	}
}
