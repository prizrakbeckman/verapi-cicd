package com.epam.verapi.controller;

import com.epam.verapi.model.Employee;
import com.epam.verapi.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class HelloController {
    
    private final EmployeeService employeeService;
    public HelloController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }
    @GetMapping("/employee/{employeename}")
    public Employee getBooks(@PathVariable("employeename") String employeename)
    {
        return employeeService.findByName(employeename);
    }

    @GetMapping("/employees")
    public Collection<Employee> getAll(){
        return employeeService.getAll();
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }
}
