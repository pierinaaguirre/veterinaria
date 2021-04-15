package com.cibertec.veterinaria.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.entity.Distrito;
import com.cibertec.veterinaria.repository.ClienteRepository;
import com.cibertec.veterinaria.repository.DistritoRepository;
import com.cibertec.veterinaria.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository cRep;
	DistritoRepository dRep;
	
	
	@Override
	public List<Cliente> listaClientes() {
		return cRep.findAll();
	}

	@Override
	public Cliente insertaActualizaCliente(Cliente obj) {
		return cRep.save(obj);
	}

	@Override
	public Optional<Cliente> obtienePorId(int cod_cli) {
		return cRep.findById(cod_cli);
	}

	@Override
	public void eliminaCliente(int cod_cli) {
		cRep.deleteById(cod_cli);
	}

	@Override
	public List<Distrito> listaDistrito() {
		
		return dRep.findAll();
	}

	/*@Override
	public List<Cliente> listaClientePorNombreLike(String filtro) {
		return cRep.listaClientePorNombreLike(filtro);
	}*/

}
