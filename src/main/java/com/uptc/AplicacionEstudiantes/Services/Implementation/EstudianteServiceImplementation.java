package com.uptc.AplicacionEstudiantes.Services.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uptc.AplicacionEstudiantes.Entities.EstudianteEntity;
import com.uptc.AplicacionEstudiantes.Management.EstudiantesManagement;
import com.uptc.AplicacionEstudiantes.Services.EstudianteService;

import jakarta.transaction.Transactional;

@Service("estudianteServiceImplementation")
@Transactional
public class EstudianteServiceImplementation implements EstudianteService {

	@Autowired
	@Qualifier("CrudEstudiantes")
	private EstudiantesManagement em;

	@Override
	public List<EstudianteEntity> getListEstudiantes() {
		// TODO Auto-generated method stub
		return (List<EstudianteEntity>) em.findAll();
	}
	
	

}
