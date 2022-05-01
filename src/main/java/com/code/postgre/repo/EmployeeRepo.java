package com.code.postgre.repo;

import com.code.postgre.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "employee")
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
    
}
