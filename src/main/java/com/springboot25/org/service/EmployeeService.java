package com.springboot25.org.service;

import com.springboot25.org.entity.Employee;
import com.springboot25.org.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmps(){
        return  employeeRepo.findAll();
    }
    public  Employee addEmployee(Employee e){
        return  employeeRepo.save((e));

    }

}
