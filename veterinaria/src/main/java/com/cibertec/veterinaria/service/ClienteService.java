package com.cibertec.veterinaria.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.veterinaria.entity.Cliente;
import com.cibertec.veterinaria.entity.Distrito;

public interface ClienteService {
	public abstract	List<Cliente> listaClientes();
	public abstract Cliente insertaActualizaCliente(Cliente obj);
	public abstract Optional<Cliente> obtienePorId(int cod_cli);
	public abstract void eliminaCliente(int cod_cli);
	public abstract List<Distrito> listaDistrito();
	//public abstract List<Cliente> listaClientePorNombreLike(String filtro);
}
