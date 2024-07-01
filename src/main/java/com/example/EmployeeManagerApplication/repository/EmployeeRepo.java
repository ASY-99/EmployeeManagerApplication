package com.example.EmployeeManagerApplication.repository;

import com.example.EmployeeManagerApplication.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {//using Employee with the JPA to interact with the DB.
//invokes default functionality of jpa to do CRUD operations
}