package com.TA26_EJ1.service;

import java.util.List;

import com.TA26_EJ1.dto.Pieza;

public interface IPiezaService {
	public List<Pieza> listarPieza();
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int id);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int id);
}
