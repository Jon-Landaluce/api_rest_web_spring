package com.landa.api.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.landa.api.rest.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository <Cliente, Long>{ // extendemos la interfaz para implementar la metodologia crud
																	// y le pasamos la entidad  y la declaracion
																	// del tipo de variable que contiene el Id en Identity
	
}
