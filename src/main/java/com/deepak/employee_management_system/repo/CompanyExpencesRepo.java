package com.deepak.employee_management_system.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.employee_management_system.model.CompanyExpences;

@Repository
public interface CompanyExpencesRepo extends JpaRepository<CompanyExpences, Integer>{
	
}
