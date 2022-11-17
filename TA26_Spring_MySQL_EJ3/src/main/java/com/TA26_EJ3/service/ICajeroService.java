package com.TA26_EJ3.service;

import java.util.List;

import com.TA26_EJ3.dto.Cajero;

public interface ICajeroService {
	public List<Cajero> listarCajero();
	
	public Cajero guardarCajero(Cajero  cajero);
	
	public Cajero cajeroXID(int id);
	
	public Cajero actualizarCajero(Cajero  cajero);
	
	public void eliminarCajero(int id);
}
