package com.prince.employee.service;

import com.prince.employee.entity.Employee;
import com.prince.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createOne(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getOne(Integer id) {

        Optional<Employee> optionalEmployee = employeeRepository.findById(id);
        if (optionalEmployee.isEmpty())
            throw  new RuntimeException("Employee does not exist");

        return optionalEmployee.get();
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
