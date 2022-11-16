package com.TA26_EJ1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA26_EJ1.dao.IPiezaDAO;
import com.TA26_EJ1.dto.Pieza;
import com.TA26_EJ1.service.PiezaServiceImpl;

@Service
public class PiezaServiceImpl implements IPiezaService{
	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listarPieza() {
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		iPiezaDAO.deleteById(id);
	}
}

