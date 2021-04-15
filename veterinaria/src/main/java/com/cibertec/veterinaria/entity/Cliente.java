package com.cibertec.veterinaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cli")
	private Integer cod_cli;
	
	@Column(name="nom_cli")
	private String nom_cli;
	
	@Column(name="ape_cli")
	private String ape_cli;
	 
	@Column(name="dni_cli")
	private String dni_cli;
	
	@Column(name="sexo_cli")
	private String sexo_cli;
	
	@Column(name="cod_dis", insertable = false, updatable = false)
	private String cod_dis;
	
	
}
