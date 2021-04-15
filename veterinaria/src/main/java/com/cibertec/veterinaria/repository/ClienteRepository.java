package com.cibertec.veterinaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cibertec.veterinaria.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	

}
