package com.TA26_EJ2.service;

import java.util.List;
import com.TA26_EJ2.dto.Proyecto;

public interface IProyectoService {

	
		public List<Proyecto> listarProyecto();
		
		public Proyecto guardarProyecto(Proyecto proyecto);
		
		public Proyecto proyectoXID(Long id); 
		
		public Proyecto actualizarProyecto(Proyecto proyecto); 
		
		public void eliminarProyecto(Long id);
	

}


