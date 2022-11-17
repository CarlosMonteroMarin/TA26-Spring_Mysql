package com.TA26_EJ3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TA26_EJ3.dao.IProductoDAO;
import com.TA26_EJ3.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {
	@Autowired
	IProductoDAO iProveedorDAO;

	@Override
	public List<Producto> listarProducto() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		return iProveedorDAO.save(producto);
	}

	@Override
	public Producto productoXID(int id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return iProveedorDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		iProveedorDAO.deleteById(id);
	}
}