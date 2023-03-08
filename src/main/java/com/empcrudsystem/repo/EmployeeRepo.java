package com.empcrudsystem.repo;

import com.empcrudsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @auther kul.paudel
 * @created at 2023-02-28
 */
public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
