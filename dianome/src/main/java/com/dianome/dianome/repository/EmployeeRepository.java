package com.dianome.dianome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dianome.dianome.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer>{
  
}
