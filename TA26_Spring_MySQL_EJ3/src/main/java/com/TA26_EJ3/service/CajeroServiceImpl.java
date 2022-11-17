package com.TA26_EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA26_EJ3.dao.ICajeroDAO;
import com.TA26_EJ3.dto.Cajero;
@Service
public class CajeroServiceImpl implements ICajeroService{
	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajero> listarCajero() {
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int id) {
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int id) {
		iCajeroDAO.deleteById(id);
	}



}
