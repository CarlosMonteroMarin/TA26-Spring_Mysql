package com.TA26_EJ1.service;

import java.util.List;

import com.TA26_EJ1.dto.Proveedor;

public interface IProveedorService {
	public List<Proveedor> listarProveedor();
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor proveedorXID(int id);
	
	public Proveedor actualizarProveedor(Proveedor proveedor);
	
	public void eliminarProveedor(int id);
}
