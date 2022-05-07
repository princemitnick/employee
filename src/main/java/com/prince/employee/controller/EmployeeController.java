package com.prince.employee.controller;


import com.prince.employee.entity.Employee;
import com.prince.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getOne(@PathVariable("id") Integer id){
        return employeeService.getOne(id);
    }

    @PostMapping("/save")
    public Employee createOne(@RequestBody Employee employee){
        return employeeService.createOne(employee);
    }

}
