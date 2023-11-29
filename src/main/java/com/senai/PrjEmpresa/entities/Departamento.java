package com.senai.PrjEmpresa.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Departamento")
public class Departamento {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Depcodigo;
	
	@NotNull
	@NotBlank
	private String Depname;
	
}