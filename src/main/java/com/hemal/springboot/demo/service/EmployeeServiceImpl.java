package com.hemal.springboot.demo.service;

import com.hemal.springboot.demo.dao.EmployeeDAO;
import com.hemal.springboot.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO theEmloyeeDAO){
        employeeDAO = theEmloyeeDAO;
    }
    @Override
    public List<Employee> findAll() {
       return  employeeDAO.findAll();
    }
}
