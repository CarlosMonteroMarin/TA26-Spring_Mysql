package com.TA26_EJ1.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA26_EJ1.dao.IProveedoreDAO;
import com.TA26_EJ1.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {
	@Autowired
	IProveedoreDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedor() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(int id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(int id) {
		iProveedorDAO.deleteById(id);
	}
}