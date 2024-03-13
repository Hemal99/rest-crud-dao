package com.hemal.springboot.demo.dao;

import com.hemal.springboot.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
