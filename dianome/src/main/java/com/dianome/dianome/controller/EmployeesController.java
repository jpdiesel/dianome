package com.dianome.dianome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dianome.dianome.model.EmployeeModel;
import com.dianome.dianome.service.EmployeeService;

@RestController
public class EmployeesController {
  @Autowired
  EmployeeService employeeService;

  @GetMapping(value = "/empregados")
  public List<EmployeeModel> getEmployeesController() {
    return employeeService.getEmployees();
  }

  @GetMapping(value = "/empregado/{id}")
  public EmployeeModel getSingleEmployeeController(@PathVariable("id") Integer id) {
    return employeeService.getEmployee(id);
  }

  @DeleteMapping(value = "/empregado/deletar/{id}")
  public boolean deleteEmployeeController(@PathVariable("id") Integer id) {
    return employeeService.deleteEmployee(id);
  }

  @PutMapping(value = "/empregado/editar/{id}")
  public EmployeeModel editEmployeeController(@PathVariable("id") Integer id, @RequestBody EmployeeModel body) {
    return employeeService.editEmployee(id, body);
  }

  @PostMapping(value = "/empregado/adicionar")
  public EmployeeModel addEmployeeController(@RequestBody EmployeeModel body) {
    return employeeService.addEmployee(body);
  }
}
