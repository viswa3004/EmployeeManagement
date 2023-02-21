package com.employeemanagement.controller;

import com.employeemanagement.entity.Employee;
import com.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;
import java.util.stream.Collectors;

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

        List<Employee> employeeList= employeeService.getEmployees();

        List<Employee> employeeFilterList=employeeList.stream().filter(t->t.getEmpSal()>1000000).collect(Collectors.toList());

        return employeeFilterList;
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
