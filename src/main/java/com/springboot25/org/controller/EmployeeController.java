package com.springboot25.org.controller;

import com.springboot25.org.entity.Employee;
import com.springboot25.org.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("boot25")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/all")
    public ResponseEntity<?> fetchllEmployees(){

        return  new ResponseEntity<List<Employee>>(employeeService.getAllEmps(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<?> addEmployee(@RequestBody Employee e){
        return  new ResponseEntity<Employee>(employeeService.addEmployee(e), HttpStatus.CREATED);
    }
}
