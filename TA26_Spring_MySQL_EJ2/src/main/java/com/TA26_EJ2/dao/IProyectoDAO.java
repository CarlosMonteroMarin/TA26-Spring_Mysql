package com.TA26_EJ2.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.TA26_EJ2.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Long>{
	
}
