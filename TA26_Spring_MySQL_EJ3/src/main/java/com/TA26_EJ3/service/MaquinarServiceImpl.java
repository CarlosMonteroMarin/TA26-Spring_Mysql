package com.TA26_EJ3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA26_EJ3.dao.IMaquinarDAO;
import com.TA26_EJ3.dto.Maquinar;



@Service
public class MaquinarServiceImpl implements IMaquinarService{
	@Autowired
	IMaquinarDAO iMaquinarDAO;

	@Override
	public List<Maquinar> listarMaquinar() {
		return iMaquinarDAO.findAll();
	}

	@Override
	public Maquinar guardarMaquinar(Maquinar maquinar) {
		return iMaquinarDAO.save(maquinar);
	}

	@Override
	public Maquinar maquinarXID(int id) {
		return iMaquinarDAO.findById(id).get();
	}

	@Override
	public Maquinar actualizarMaquinar(Maquinar maquinar) {
		return iMaquinarDAO.save(maquinar);
	}

	@Override
	public void eliminarMaquinar(int id) {
		iMaquinarDAO.deleteById(id);
	}
}

