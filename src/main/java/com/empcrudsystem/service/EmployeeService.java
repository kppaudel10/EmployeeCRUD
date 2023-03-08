package com.empcrudsystem.service;

import com.empcrudsystem.model.Employee;

import java.util.List;

/**
 * @auther kul.paudel
 * @created at 2023-02-28
 */
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    String deleteEmployee(Long empId);

    List<Employee> getAllEmployee();
}
