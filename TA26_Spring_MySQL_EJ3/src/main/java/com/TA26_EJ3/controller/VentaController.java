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

import com.TA26_EJ3.dto.Venta;
import com.TA26_EJ3.service.VentaServiceImpl;




@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	VentaServiceImpl proveedorServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVenta(){
		return proveedorServiceImpl.listarVenta();
	}
	
	
	@PostMapping("/ventas")
	public Venta salvarVenta(@RequestBody Venta venta) {
		
		return proveedorServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/venta/{id}")
	public Venta proveedorXID(@PathVariable(name="id") int id) {
		
		Venta venta_xid= new Venta();
		
		venta_xid=proveedorServiceImpl.ventaXID(id);
		
		
		return venta_xid;
	}
	
	@PutMapping("/venta/{id}")
	public Venta actualizarVenta(@PathVariable(name="id")int id,@RequestBody Venta venta) {
		
		Venta venta_seleccionado= new Venta();
		Venta venta_actualizado= new Venta();
		
		venta_seleccionado= proveedorServiceImpl.ventaXID(id);
		
		venta_seleccionado.setCajero(venta.getCajero());
		venta_seleccionado.setMaquinar(venta.getMaquinar());
		venta_seleccionado.setProducto(venta.getProducto());

		
		venta_actualizado = proveedorServiceImpl.actualizarVenta(venta_seleccionado);
		
		
		return venta_actualizado;
	}
	
	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable(name="id")int id) {
		proveedorServiceImpl.eliminarVenta(id);
	}
	
	
}
