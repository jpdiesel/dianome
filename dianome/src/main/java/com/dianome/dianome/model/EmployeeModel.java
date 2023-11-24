package com.dianome.dianome.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class EmployeeModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nome;
  private String cpf;

  @Column(name = "capacidade_veiculo_kg")
  private Integer capacidade;

  
  public EmployeeModel(String nome, String cpf, Integer capacidade) {
    this.nome = nome;
    this.cpf = cpf;
    this.capacidade = capacidade;
  }
  
  public EmployeeModel(){}
  
  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Integer getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(Integer capacidade) {
    this.capacidade = capacidade;
  }
}
