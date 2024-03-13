package com.hemal.springboot.demo.service;

import com.hemal.springboot.demo.entity.Employee;

import java.util.List;


public interface EmployeeService {

    List<Employee> findAll();

}
