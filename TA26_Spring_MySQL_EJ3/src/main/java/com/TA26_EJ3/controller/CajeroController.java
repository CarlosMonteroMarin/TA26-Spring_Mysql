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

import com.TA26_EJ3.dto.Cajero;
import com.TA26_EJ3.service.CajeroServiceImpl;


@RestController
@RequestMapping("/api")
public class CajeroController {
	
	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajero(){
		return cajeroServiceImpl.listarCajero();
	}
	
	
	@PostMapping("/cajeros")
	public Cajero salvarCajero(@RequestBody Cajero cajero) {
		
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	
	@GetMapping("/pieza/{id}")
	public Cajero cajeroXID(@PathVariable(name="id") int id) {
		
		Cajero cajero_xid= new Cajero();
		
		cajero_xid=cajeroServiceImpl.cajeroXID(id);
		
		
		return cajero_xid;
	}
	
	@PutMapping("/cajero/{id}")
	public Cajero actualizarCajero(@PathVariable(name="id")int id,@RequestBody Cajero cajero) {
		
		Cajero cajero_seleccionado= new Cajero();
		Cajero cajero_actualizado= new Cajero();
		
		cajero_seleccionado= cajeroServiceImpl.cajeroXID(id);
		
		cajero_seleccionado.setNomapels(cajero.getNomapels());
		
		cajero_actualizado = cajeroServiceImpl.actualizarCajero(cajero_seleccionado);
		
		
		return cajero_actualizado;
	}
	
	@DeleteMapping("/cajero/{id}")
	public void eliminarCajero(@PathVariable(name="id")int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
	
	
}
