package com.TA26_EJ2.service;

import java.util.List;

import com.TA26_EJ2.dto.Cientifico;

public interface ICientificoService {

	
		public List<Cientifico> listarCientifico();
		
		public Cientifico guardarCientifico(Cientifico cientifico);
		
		public Cientifico cientificoXID(Long id); 
		
		public Cientifico actualizarCientifico(Cientifico cientifico); 
		
		public void eliminarCientifico(Long id);
	

}


