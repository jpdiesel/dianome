package com.dianome.dianome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
  @GetMapping(value = "/")
  public String getEmployees() {
    return "Está funcionando";
  }
}
