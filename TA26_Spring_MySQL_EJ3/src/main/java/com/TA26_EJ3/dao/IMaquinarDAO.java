package com.TA26_EJ3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TA26_EJ3.dto.Maquinar;

public interface IMaquinarDAO extends JpaRepository<Maquinar, Integer> {
	
}
