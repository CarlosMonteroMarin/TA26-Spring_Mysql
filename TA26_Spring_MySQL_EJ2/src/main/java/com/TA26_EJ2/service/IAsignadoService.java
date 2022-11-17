package com.TA26_EJ2.service;

import java.util.List;

import com.TA26_EJ2.dto.Asignado;

public interface IAsignadoService {

	
		public List<Asignado> listarAsignado();
		
		public Asignado guardarAsignado(Asignado asignado);
		
		public Asignado asignadoXID(Long id); 
		
		public Asignado actualizarAsignado(Asignado asignado); 
		
		public void eliminarAsignado(Long id);
	

}


