package com.cibertec.veterinaria.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.veterinaria.entity.Mascota;

public interface MascotaService {
	public abstract	List<Mascota> listaMascotas();
	public abstract Mascota insertaActualizaMascota(Mascota obj);
	public abstract Optional<Mascota> obtienePorId(int cod_mas);
	public abstract void eliminaMascota(int cod_mas);
	//public abstract List<Mascota> listaMascotaPorNombreLike(String filtro);
}
