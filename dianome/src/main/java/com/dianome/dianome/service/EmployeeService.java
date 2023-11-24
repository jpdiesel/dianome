package com.dianome.dianome.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dianome.dianome.model.EmployeeModel;
import com.dianome.dianome.repository.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository employeeRepository;


  public List<EmployeeModel> getEmployees() {
    return employeeRepository.findAll();
  }


  public EmployeeModel getEmployee(Integer id) {
    return employeeRepository.findById(id).get();
  }


  public boolean deleteEmployee(Integer id) {
    if(!employeeRepository.findById(id).equals(Optional.empty())) {
      employeeRepository.deleteById(id);
      return true;
    } return false;
  }


  public EmployeeModel editEmployee(Integer id, EmployeeModel body) {
    EmployeeModel current = employeeRepository.findById(id).get();
    current.setCapacidade(body.getCapacidade());
    current.setNome(body.getNome());
    current.setCpf(body.getCpf());
    employeeRepository.save(current);
    return current;
  }


  public EmployeeModel addEmployee(EmployeeModel body) {
    String nome = body.getNome();
    String cpf = body.getCpf();
    Integer capacidade = body.getCapacidade();
    EmployeeModel newEmployee = new EmployeeModel(nome, cpf, capacidade);
    employeeRepository.save(newEmployee);
    return newEmployee;
  }
}
