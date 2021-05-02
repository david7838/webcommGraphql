package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Organization;

@Repository
public interface OrganizationDao extends JpaRepository<Organization, Integer>{

}
