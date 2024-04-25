package com.landa.api.rest.service;

import java.util.List;
import com.landa.api.rest.entity.Cliente;

public interface ClienteService {
	// metodo para devolver todos los registros
	public abstract List<Cliente> buscarTodos();
	// metodo para buscar un registro por id
	public Cliente buscarPorId(Long id);
	// metodo para guardar un registro 
	public Cliente guardar(Cliente cliente);
	// metodo para eliminar
	public void delete(Long id);
	
	
}
