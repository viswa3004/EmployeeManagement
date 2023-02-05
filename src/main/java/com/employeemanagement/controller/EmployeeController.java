package com.employeemanagement.controller;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> employeeList(){

        return employeeService.getEmployees();
    }

    @PostMapping("/saveEmployee")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @GetMapping("getID/{id}")
    public Employee findById(@PathVariable Integer id) {
        return employeeService.findById(id);
    }

    @PutMapping("update/{id}")
    public Employee update(@PathVariable Integer id, @RequestBody Employee employee) {
        employee.setEmpid(id);
        return employeeService.update(id,employee);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Integer id) {
        employeeService.delete(id);
    }
}
