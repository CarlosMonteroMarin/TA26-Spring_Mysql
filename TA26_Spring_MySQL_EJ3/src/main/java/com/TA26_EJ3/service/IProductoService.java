package com.TA26_EJ3.service;

import java.util.List;

import com.TA26_EJ3.dto.Producto;

public interface IProductoService {
	public List<Producto> listarProducto();
	
	public Producto guardarProducto(Producto producto);
	
	public Producto productoXID(int id);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(int id);
}
