package com.TA26_EJ3.controller;

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

import com.TA26_EJ3.dto.Producto;
import com.TA26_EJ3.service.ProductoServiceImpl;


@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl proveedorServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProducto(){
		return proveedorServiceImpl.listarProducto();
	}
	
	
	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {
		
		return proveedorServiceImpl.guardarProducto(producto);
	}
	
	
	@GetMapping("/producto/{id}")
	public Producto productoXID(@PathVariable(name="id") int id) {
		
		Producto producto_xid= new Producto();
		
		producto_xid=proveedorServiceImpl.productoXID(id);
		
		
		return producto_xid;
	}
	
	@PutMapping("/producto/{id}")
	public Producto actualizarProducto(@PathVariable(name="id")int id,@RequestBody Producto producto) {
		
		Producto producto_seleccionado= new Producto();
		Producto producto_actualizado= new Producto();
		
		producto_seleccionado= proveedorServiceImpl.productoXID(id);
		
		producto_seleccionado.setNombre(producto.getNombre());
		producto_seleccionado.setPrecio(producto.getPrecio());

		
		producto_actualizado = proveedorServiceImpl.actualizarProducto(producto_seleccionado);
		
		
		return producto_actualizado;
	}
	
	@DeleteMapping("/producto/{id}")
	public void eliminarProducto(@PathVariable(name="id")int id) {
		proveedorServiceImpl.eliminarProducto(id);
	}
	
	
}
