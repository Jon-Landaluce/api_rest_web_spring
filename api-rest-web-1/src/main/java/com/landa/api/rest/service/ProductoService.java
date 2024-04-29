package com.landa.api.rest.service;

import java.util.List;

import com.landa.api.rest.entity.Producto;

public interface ProductoService {
	
	// Metodo para busqueda/traer_todos
	public abstract List<Producto> buscarTodos();
	// Metodo para buscar por id
	public Producto buscarPorId (Long id);
	// Metodo para registrar un producto
	public Producto registrar (Producto producto);
	// Metodo para actualizar?? Usamos el guardar directamente?
	// Metodo para borrar
	public Producto delete(Long id);
	

}

