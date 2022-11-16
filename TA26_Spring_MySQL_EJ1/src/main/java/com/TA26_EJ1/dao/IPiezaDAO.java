package com.TA26_EJ1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TA26_EJ1.dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer> {
	
}
