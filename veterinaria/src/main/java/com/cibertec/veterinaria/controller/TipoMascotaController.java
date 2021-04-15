package com.cibertec.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cibertec.veterinaria.entity.TipoMascota;
import com.cibertec.veterinaria.service.TipoMascotaService;

@Controller
public class TipoMascotaController {
	
	@Autowired
	TipoMascotaService tmService;
	
	@RequestMapping("/listaTipoMascota")
	@ResponseBody
	public List<TipoMascota> listaTipoMascota(){
		return tmService.listaTipoMascotas();
	}

}
