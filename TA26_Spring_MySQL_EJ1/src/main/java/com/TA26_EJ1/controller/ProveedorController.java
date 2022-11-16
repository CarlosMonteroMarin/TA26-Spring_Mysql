package com.TA26_EJ1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TA26_EJ1.dto.Proveedor;
import com.TA26_EJ1.service.ProveedorServiceImpl;


@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedor(){
		return proveedorServiceImpl.listarProveedor();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") int id) {
		
		Proveedor Proveedor_xid= new Proveedor();
		
		Proveedor_xid=proveedorServiceImpl.proveedorXID(id);
		
		
		return Proveedor_xid;
	}
	
	@PutMapping("/proveedor/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")int id,@RequestBody Proveedor proveedor) {
		
		Proveedor Proveedor_seleccionado= new Proveedor();
		Proveedor Proveedor_actualizado= new Proveedor();
		
		Proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		
		Proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		Proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(Proveedor_seleccionado);
		
		
		return Proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedor/{id}")
	public void eliminarProveedor(@PathVariable(name="id")int id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
	
	
}
