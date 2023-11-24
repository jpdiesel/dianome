package com.dianome.dianome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dianome.dianome.model.EmployeeModel;
import com.dianome.dianome.repository.EmployeeRepository;

@RestController
public class EmployeesController {
  @Autowired
  EmployeeRepository employeeRepository;

  @GetMapping(value = "/empregados")
  public List<EmployeeModel> getEmployees() {
    return employeeRepository.findAll();
  }

  @GetMapping(value = "/empregados/{id}")
  public EmployeeModel getSingleEmployee(@PathVariable("identity") Integer id) {
    return employeeRepository.findById(id).get();
  }

}
