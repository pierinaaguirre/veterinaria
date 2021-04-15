package com.cibertec.veterinaria.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_mascota")
public class Mascota implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_cli")
	private Integer cod_mas;
	
	@Column(name="nom_mas")
	private String nom_mas;
	
	@Column(name="cod_cli", insertable = false, updatable = false)
	private String cod_cli;

	@Column(name="codTipo_masc", insertable = false, updatable = false)
	private String codTipo_masc;
	
	
}
