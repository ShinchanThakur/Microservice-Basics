package com.thakur.shinchan.demo.resource;

import com.thakur.shinchan.demo.employee.Employee;
import com.thakur.shinchan.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String homePage(){
        return "Home Page";
    }

    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployee(){
        Employee employee = employeeService.getEmployee();
        return ResponseEntity.ok().body(employee);
    }
}
