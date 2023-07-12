package com.thakur.shinchan.demo.services;

import com.thakur.shinchan.demo.employee.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Sarthak Teacher");
        return employee;
    }
}
