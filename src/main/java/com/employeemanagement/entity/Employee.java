package com.employeemanagement.entity;

import jakarta.persistence.*;
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

    @Column(name = "empdept")
    private String empDept;

    @Column(name = "currentdate")
    private Date currentDate;

    @Column(name = "updateddate")
    private Date updatedDate;

    @Column(name = "address")
    private String address;
}
