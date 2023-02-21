package com.employeemanagement.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empid;

    @Column(name = "empname")
    private String empName;

    @Column(name = "empsal")
    private Double empSal;

    @Column(name = "empdeptid")
    private String empDept;

    @Column(name = "currentdate")
    private Date currentDate;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "address")
    private String address;
}
