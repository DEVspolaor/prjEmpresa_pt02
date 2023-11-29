package com.senai.PrjEmpresa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="funcionário")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@NotBlank
	private String nome;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@NotBlank
	private LocalDate funnascimento;
	
	@NotNull
	@NotBlank
	private Double salario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getFunnascimento() {
		return funnascimento;
	}
	public void setFunnascimento(LocalDate funnascimento) {
		this.funnascimento = funnascimento;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@ManyToOne
	private Departamento departamento;

//inserir os metodos get e o set
public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	
}