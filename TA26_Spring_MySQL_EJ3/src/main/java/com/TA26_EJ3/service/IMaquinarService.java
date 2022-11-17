package com.TA26_EJ3.service;

import java.util.List;

import com.TA26_EJ3.dto.Maquinar;

public interface IMaquinarService {
	public List<Maquinar> listarMaquinar();
	
	public Maquinar guardarMaquinar(Maquinar maquinar);
	
	public Maquinar maquinarXID(int id);
	
	public Maquinar actualizarMaquinar(Maquinar maquinar);
	
	public void eliminarMaquinar(int id);
}
