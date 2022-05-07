package com.prince.employee.repository;

import com.prince.employee.entity.Employee;
import com.prince.employee.entity.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmployeeRepositoryTest {

    /**
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void createEmployee(){

        employeeRepository.save(
                Employee
                        .builder()
                        .code("30984SD-234")
                        .email("prstanley@pih.org")
                        .firstName("Prince Stanley")
                        .lastName("Jean Baptiste")
                        .gender(Gender.MALE)
                        .startDate(LocalDate.of(2016,9,12))
                        .build()
        );
        System.out.println("Employee Created");
    }

    @Test
    void getAllEmployee(){
        employeeRepository.findAll().forEach(
                employee -> {
                    System.out.println(employee.toString());
                }
        );
    }
    */
}