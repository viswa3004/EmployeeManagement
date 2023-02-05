package com.employeemanagement.service;

import com.employeemanagement.dao.EmployeeDao;
import com.employeemanagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getEmployees(){

        List<Employee> employees=employeeDao.findAll();
        //Long emp=employees.stream().filter(x->x.getEmpSal()==1000000).count();
        return employees;
    }

    public Employee create(Employee employee) {
        return employeeDao.save(employee);
    }

    public Employee findById(Integer id) {
        return employeeDao.findById(id).orElse(null);
    }

    public Employee update(Integer id,Employee employee) {
        employee.setEmpid(id);
        return employeeDao.save(employee);
    }

    public void delete(Integer id) {
        employeeDao.deleteById(id);
    }
}
