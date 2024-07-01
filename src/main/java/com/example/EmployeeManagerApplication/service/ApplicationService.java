package com.example.EmployeeManagerApplication.service;

import com.example.EmployeeManagerApplication.model.Employee;
import com.example.EmployeeManagerApplication.repository.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
@Transactional
public class ApplicationService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    public ApplicationService(EmployeeRepo employeeRepo) {
        super();
        this.employeeRepo = employeeRepo;
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public ArrayList<Employee> addMultipleEmployee(ArrayList<Employee> employee) {
        return (ArrayList<Employee>) employeeRepo.saveAll(employee);
    }

    public List<Employee> allEmployee() {
        return employeeRepo.findAll();
    }

    public List<Employee> getEmployeesByGender() {
        List<Employee> employees = employeeRepo.findAll();
        Predicate<Employee> predicateP = employee -> employee.getGender().equals("Male");
        return employees.stream().filter(predicateP).collect(Collectors.toList());
    }
}
