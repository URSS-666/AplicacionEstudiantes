package com.uptc.AplicacionEstudiantes.Management;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uptc.AplicacionEstudiantes.Entities.EstudianteEntity;

@Repository("CrudEstudiantes")
public interface EstudiantesManagement extends CrudRepository<EstudianteEntity,Integer> {
     
}
