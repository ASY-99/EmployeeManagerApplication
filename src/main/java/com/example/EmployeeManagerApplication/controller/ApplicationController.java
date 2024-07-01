package com.example.EmployeeManagerApplication.controller;

import com.example.EmployeeManagerApplication.model.Employee;
import com.example.EmployeeManagerApplication.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class ApplicationController {

    @Autowired
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> emp = applicationService.allEmployee();
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @GetMapping("/allByGender")
    public ResponseEntity<List<Employee>> getAllEmployeebyGender() {
        List<Employee> emp = applicationService.getEmployeesByGender();
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @PostMapping
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return applicationService.addEmployee(employee);
    }

//    @PostMapping("/listOfEmployee")
//    public ArrayList<Employee> addMultipleNewEmployee(@RequestBody ArrayList<Employee> employee) {
//        return (ArrayList<Employee>)applicationService.addMultipleEmployee(employee);
//    }

}
