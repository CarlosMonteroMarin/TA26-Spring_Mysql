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

import com.TA26_EJ3.dto.Maquinar;
import com.TA26_EJ3.service.MaquinarServiceImpl;


@RestController
@RequestMapping("/api")
public class MaquinarController {
	
	@Autowired
	MaquinarServiceImpl maquinarServiceImpl;
	
	@GetMapping("/maquinar")
	public List<Maquinar> listarMaquinar(){
		return maquinarServiceImpl.listarMaquinar();
	}
	

	@PostMapping("/maquinar")
	public Maquinar salvarSMaquinar(@RequestBody Maquinar maquinar) {
		
		return maquinarServiceImpl.guardarMaquinar(maquinar);
	}
	
	
	@GetMapping("/maquinar/{id}")
	public Maquinar maquinarXID(@PathVariable(name="id") int id) {
		
		Maquinar maquinar_xid= new Maquinar();
		
		maquinar_xid=maquinarServiceImpl.maquinarXID(id);
		
		
		return maquinar_xid;
	}
	
	@PutMapping("/maquinar/{id}")
	public Maquinar actualizarMaquinar(@PathVariable(name="id")int id,@RequestBody Maquinar maquinar) {
		
		Maquinar maquinar_seleccionado= new Maquinar();
		Maquinar maquinar_actualizado= new Maquinar();
		
		maquinar_seleccionado= maquinarServiceImpl.maquinarXID(id);
		
		
		maquinar_seleccionado.setPiso(maquinar.getPiso());
		
		maquinar_actualizado = maquinarServiceImpl.actualizarMaquinar(maquinar_seleccionado);
		
		
		return maquinar_actualizado;
	}
	
	@DeleteMapping("/maquinar/{id}")
	public void eliminarMaquinar(@PathVariable(name="id")int id) {
		maquinarServiceImpl.eliminarMaquinar(id);
	}
	
	
}
