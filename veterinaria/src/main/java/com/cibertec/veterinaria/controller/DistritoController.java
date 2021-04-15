package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cibertec.veterinaria.entity.Distrito;
import com.cibertec.veterinaria.service.DistritoService;

@Controller
public class DistritoController {
	
	@Autowired 
	DistritoService distritoService;
	
	@RequestMapping("/listaDistritos")
	@ResponseBody
	public List<Distrito> listaDistritos(){
		
		return distritoService.listaDistrito();
	}
}
