package com.TA26_EJ3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TA26_EJ3.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer> {
	
}
