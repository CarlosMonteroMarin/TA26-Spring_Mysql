package com.TA26_EJ3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA26_EJ3.dao.IVentaDAO;
import com.TA26_EJ3.dto.Venta;
@Service
public class VentaServiceImpl implements IVentaService{
	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Venta> listarVenta() {
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		iVentaDAO.deleteById(id);
	}



}
