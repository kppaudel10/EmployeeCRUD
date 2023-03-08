package com.empcrudsystem.service;

import com.empcrudsystem.model.Employee;
import com.empcrudsystem.repo.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @auther kul.paudel
 * @created at 2023-02-28
 */
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepo employeeRepo;
    @Override
    public Employee saveEmployee(Employee employee) {
        Employee newEmployee = new Employee();
        if (employee.getId() != null){
            Optional<Employee> employeeOptional = employeeRepo.findById(employee.getId());
            if (employeeOptional.isPresent())
                newEmployee = employeeOptional.get();
        }
        if (newEmployee == null){
            newEmployee = employee;
        }else {
            newEmployee.setName(employee.getName());
            newEmployee.setAge(employee.getAge());
            newEmployee.setContact(employee.getContact());
            newEmployee.setAddress(employee.getAddress());
        }
        employeeRepo.save(newEmployee);
        return newEmployee;
    }

    @Override
    public String deleteEmployee(Long empId) {
        try {
            employeeRepo.deleteById(empId);
            return "Employee successfully deleted";
        }catch (Exception e){
            return "Unable to delete employee";
        }
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }
}
