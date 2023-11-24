package com.dianome.dianome.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
  public EmployeeModel getSingleEmployee(@PathVariable("id") Integer id) {
    return employeeRepository.findById(id).get();
  }

  @DeleteMapping(value = "/empregados/{id}")
  public boolean deleteEmployee(@PathVariable("id") Integer id) {
    if(!employeeRepository.findById(id).equals(Optional.empty())) {
      employeeRepository.deleteById(id);
      return true;
    } return false;
  }

  @PutMapping(value = "/empregados/{id}")
  public EmployeeModel editEmployee(@PathVariable("id") Integer id, @RequestBody Map<String, String> body) {
    EmployeeModel current = employeeRepository.findById(id).get();
    current.setCapacidade(Integer.parseInt(body.get("capacidade")));
    current.setNome(body.get("nome"));
    current.setCpf(body.get("cpf"));
    employeeRepository.save(current);
    return current;
  }

  @PostMapping(value = "/empregados")
  public EmployeeModel addEmployee(@RequestBody Map<String, String> body) {
    String nome = body.get("nome");
    String cpf = body.get("cpf");
    Integer capacidade = Integer.parseInt(body.get("capacidade"));
    EmployeeModel newEmployee = new EmployeeModel(nome, cpf, capacidade);
    employeeRepository.save(newEmployee);
    return newEmployee;
  }
}
