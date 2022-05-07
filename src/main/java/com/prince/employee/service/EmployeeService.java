package com.prince.employee.service;

import com.prince.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee createOne(Employee employee);
    Employee getOne(Integer id);
    List<Employee> getAll();
}
