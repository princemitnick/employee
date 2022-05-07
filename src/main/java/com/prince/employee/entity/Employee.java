package com.prince.employee.entity;

import com.prince.employee.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {

    @Id
    @SequenceGenerator(
            sequenceName = "employee_sequence",
            name = "employee_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private Integer id;
    private String lastName;
    private String firstName;

    @Column(
            unique = true
    )
    private String code;
    private String function;
    private LocalDate startDate;
    private Gender gender;

    @Column(
            unique = true
    )
    private String email;

}
