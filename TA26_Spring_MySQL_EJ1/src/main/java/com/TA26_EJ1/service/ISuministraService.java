package com.TA26_EJ1.service;

import java.util.List;

import com.TA26_EJ1.dto.Suministra;

public interface ISuministraService {
	public List<Suministra> listarSuministra();
	
	public Suministra guardarSuministra(Suministra suministra);
	
	public Suministra suministraXID(int id);
	
	public Suministra actualizarSuministra(Suministra suministra);
	
	public void eliminarSuministra(int id);
}
