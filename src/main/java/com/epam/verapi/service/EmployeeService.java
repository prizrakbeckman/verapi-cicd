package com.epam.verapi.service;

import com.epam.verapi.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private final Map<String,Employee> employeesByName = new LinkedHashMap<>();

    public EmployeeService(){
        fillEmployees();
    }

    private void fillEmployees() {
        Employee employee = new Employee(28,"Jan", "Mernok" );
        Employee employee1 = new Employee(28,"Patrik", "Mernok" );
        Employee employee2 = new Employee(28,"Paweł", "Mernok" );
        employeesByName.put("Jan", employee);
        employeesByName.put("Patrik", employee1);
        employeesByName.put("Paweł", employee2);
    }

    public void addEmployee(Employee employee){
        employeesByName.putIfAbsent(employee.getName(), employee);
    }

    public Collection<Employee> getAll(){
        return employeesByName.values();
    }

    public Employee findByName(String name){
        return employeesByName.get(name);
    }
}
