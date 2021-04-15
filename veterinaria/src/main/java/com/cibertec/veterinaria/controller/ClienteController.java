package com.cibertec.veterinaria.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.entity.Distrito;
import com.cibertec.veterinaria.service.ClienteService;
import com.cibertec.veterinaria.service.DistritoService;
import com.cibertec.veterinaria.util.Constantes;

@Controller
public class ClienteController {

	@Autowired
	ClienteService cService;
	DistritoService dService;
	
	@RequestMapping("/listaClientes")
	@ResponseBody
	public List<Cliente> listaClientes(){
		return cService.listaClientes();
	}
	
	@RequestMapping("/listaDistritos")
	@ResponseBody
	public List<Distrito> listaDistrito(){
		return dService.listaDistrito();
	}
	
	/*@RequestMapping("/consultaCliente")
	@ResponseBody
	public List<Cliente> filtoNombreCliente(String filtro) {
		return cService.listaClientePorNombreLike(filtro.trim() + "%");	
	}*/
	
	@PostMapping("/registraCliente")
	@ResponseBody
	public Map<String, Object> registra(Cliente obj) {
		Map<String, Object> salida = new HashMap<String, Object>();
		Cliente objSalida = null;
		try {
			objSalida = cService.insertaActualizaCliente(objSalida);
			if (objSalida == null) {
				salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_REG_EXITOSO);
			}
		} catch (Exception e) {
			salida.put("mensaje", Constantes.MENSAJE_REG_ERROR);
		} finally {
			List<Cliente> lista = cService.listaClientes();
			salida.put("lista", lista);
		}
		return salida;
	}
	
	@PostMapping("/actualizaCliente")
	@ResponseBody
	public Map<String, Object> actualiza(Cliente obj) {
		Map<String, Object> salida = new HashMap<String, Object>();
		try {
			Optional<Cliente> option = cService.obtienePorId(obj.getCod_cli());
			if (option.isPresent()) {
				Cliente objSalida = cService.insertaActualizaCliente(obj);
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
			List<Cliente> lista = cService.listaClientes();
			salida.put("lista", lista);
		}
		return salida;
	}

	@RequestMapping("/eliminaCliente")
	@ResponseBody
	public Map<String, Object> elimina(int cod_cli) {
		Map<String, Object> salida = new HashMap<String, Object>();
		Optional<Cliente> option = cService.obtienePorId(cod_cli);
		try {
			if (option.isPresent()) {
				cService.eliminaCliente(cod_cli);
				salida.put("mensaje", Constantes.MENSAJE_ELI_EXITOSO);
			} else {
				salida.put("mensaje", Constantes.MENSAJE_ELI_NO_EXISTE_ID);
			}
		} catch (Exception e) {
			e.printStackTrace();
			salida.put("mensaje", Constantes.MENSAJE_ELI_ERROR);
		} finally {
			List<Cliente> lista = cService.listaClientes();
			salida.put("lista", lista);
		}
		return salida;
	}
}
