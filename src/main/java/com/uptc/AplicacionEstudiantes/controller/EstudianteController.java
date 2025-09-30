package com.uptc.AplicacionEstudiantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.AplicacionEstudiantes.Services.Implementation.EstudianteServiceImplementation;
import com.uptc.AplicacionEstudiantes.Entities.EstudianteEntity;
@RestController
@RequestMapping("/estudiante")
@CrossOrigin(origins="*")
public class EstudianteController {
	
	@Autowired
	@Qualifier("estudianteServiceImplementation")
	private EstudianteServiceImplementation esi;
	
	
	@GetMapping(path="/listar/",produces= MediaType.APPLICATION_JSON_VALUE)
	public List<EstudianteEntity> listarEstudiantes(){
		
		return esi.getListEstudiantes();
	}
	
}
