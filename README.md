# EmployeeManagement
Creating EmployeeManagement RestAPI using springboot 3 , JPA and Swagger


Database configuration

CREATE DATABASE `employeemanagement`


CREATE TABLE `employee` (
  `empid` int(11) NOT NULL AUTO_INCREMENT,
  `empname` varchar(100) DEFAULT NULL,
  `empsal` double DEFAULT NULL,
  `empdeptid` varchar(100) DEFAULT NULL,
  `currentdate` date DEFAULT NULL,
  `updateddate` date DEFAULT NULL,
  `address` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`empid`)
) 


Adding Junit + Mockito test cases for the Application
