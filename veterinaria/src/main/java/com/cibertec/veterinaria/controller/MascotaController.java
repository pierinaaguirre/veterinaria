package com.cibertec.veterinaria.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cibertec.veterinaria.entity.Mascota;
import com.cibertec.veterinaria.service.MascotaService;
import com.cibertec.veterinaria.util.Constantes;

@Controller
public class MascotaController {
	
	@Autowired
	MascotaService mSevice;
	
	@RequestMapping("/listaMascotas")
	@ResponseBody
	public List<Mascota> listaMascotas(){
		return mSevice.listaMascotas();
	}
	
	/*@RequestMapping("/consultaMascota")
	@ResponseBody
	public List<Mascota> filtoNombreMascota(String filtro) {
		return mSevice.listaMascotaPorNombreLike(filtro.trim() + "%");
	}*/
	
	@RequestMapping("/registraMascota")
	@ResponseBody
	public Map<String, Object> registra(Mascota obj) {
		Map<String, Object> salida = new HashMap<String, Object>();
		Mascota objSalida = null;
		try {
			objSalida = mSevice.insertaActualizaMascota(objSalida);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		} finally {
			List<Mascota> lista = mSevice.listaMascotas();
			salida.put("lista", lista);
		}
		return salida;
	}
	
	@RequestMapping("/actualizaMascota")
	@ResponseBody
	public Map<String, Object> actualiza(Mascota obj) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			Optional<Mascota> option = mSevice.obtienePorId(obj.getCod_mas());
			if (option.isPresent()) {
				Mascota objSalida = mSevice.insertaActualizaMascota(obj);
				if (objSalida == null) {
					salida.put("mensaje", Constantes.MENSAJE_ACT_ERROR);
				} else {
					salida.put("mensaje", Constantes.MENSAJE_ACT_EXITOSO);
				}
			} else {
				salida.put("mensaje", Constantes.MENSAJE_ACT_NO_EXISTE_ID);
			}
		} catch (Exception e) {
			salida.put("mensaje", Constantes.MENSAJE_ACT_ERROR);
		} finally {
			List<Mascota> lista = mSevice.listaMascotas();
			salida.put("lista", lista);
		}
		return salida;
	}

	@RequestMapping("/eliminaMascota")
	@ResponseBody
	public Map<String, Object> elimina(int cod_mas) {
		Map<String, Object> salida = new HashMap<String, Object>();
		Optional<Mascota> option = mSevice.obtienePorId(cod_mas);
		try {
			if (option.isPresent()) {
				mSevice.eliminaMascota(cod_mas);
				salida.put("mensaje", Constantes.MENSAJE_ELI_EXITOSO);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_ELI_NO_EXISTE_ID);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_ELI_ERROR);
		} finally {
			List<Mascota> lista = mSevice.listaMascotas();
			salida.put("lista", lista);
		}
		return salida;
	}

}
