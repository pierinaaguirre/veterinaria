package com.cibertec.veterinaria.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.veterinaria.entity.Mascota;
import com.cibertec.veterinaria.repository.MascotaRepository;
import com.cibertec.veterinaria.service.MascotaService;

@Service
public class MascotaServiceImpl implements MascotaService{

	@Autowired
	MascotaRepository mRep;
	
	@Override
	public List<Mascota> listaMascotas() {
		return mRep.findAll();
	}

	@Override
	public Mascota insertaActualizaMascota(Mascota obj) {
		return mRep.save(obj);
	}

	@Override
	public Optional<Mascota> obtienePorId(int cod_mas) {
		return mRep.findById(cod_mas);
	}

	@Override
	public void eliminaMascota(int cod_mas) {
		mRep.deleteById(cod_mas);
	}

	/*@Override
	public List<Mascota> listaMascotaPorNombreLike(String filtro) {
		return mRep.listaMascotaPorNombreLike(filtro);
	}*/

}
