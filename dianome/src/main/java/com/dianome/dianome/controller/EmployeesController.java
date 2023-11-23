package com.dianome.dianome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dianome.dianome.model.EmployeeModel;
import com.dianome.dianome.repository.EmployeeRepository;

@RestController
public class EmployeesController {
  @Autowired
  EmployeeRepository employeeRepository;

  @GetMapping(value = "/")
  public List<EmployeeModel> getEmployees() {
    return employeeRepository.findAll();
  }
}
