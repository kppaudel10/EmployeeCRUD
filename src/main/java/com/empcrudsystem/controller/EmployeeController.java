package com.empcrudsystem.controller;

import com.empcrudsystem.globalsetup.GlobalResponse;
import com.empcrudsystem.model.Employee;
import com.empcrudsystem.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @auther kul.paudel
 * @created at 2023-02-28
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/save")
    public GlobalResponse saveEmployee(@RequestBody Employee employee){
        return new GlobalResponse(employeeService.saveEmployee(employee),"Employee data save successfully",true);
    }

    @DeleteMapping("/delete")
    public GlobalResponse deleteEmployee(@RequestParam("employeeId") long employeeId){
        return new GlobalResponse(employeeService.deleteEmployee(employeeId),"Employee Deleted successfully",true);
    }

    @GetMapping("/list")
    public GlobalResponse getAllEmployeeList(){
        return new GlobalResponse(employeeService.getAllEmployee(),"Employee data fetch successfully",true);
    }
}
