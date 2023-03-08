package com.empcrudsystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther kul.paudel
 * @created at 2023-02-28
 */
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_GEN")
    @SequenceGenerator(name = "employee_GEN", sequenceName = "employee_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String contact;

    private String address;

    private Integer age;
}
