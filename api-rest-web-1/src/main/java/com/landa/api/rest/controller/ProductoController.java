package com.landa.api.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.landa.api.rest.entity.Producto;
import com.landa.api.rest.service.ProductoService;


@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	private ProductoService servicioProd;
	
	@GetMapping("/productos")
	public List<Producto> index() {
		return servicioProd.buscarTodos();
	}
	
	@GetMapping("/productos/{id}")
	public Producto show(@PathVariable long id) {
		return servicioProd.buscarPorId(id);
	}
	
	@PostMapping("/productos")
	public Producto create(@RequestBody Producto producto) {
		return servicioProd.registrar(producto);
	}
	
	@PutMapping("/productos/{id}")
	public Producto update(@PathVariable long id, @RequestBody Producto producto) {
		Producto productoUpdate = servicioProd.buscarPorId(id);
		
		productoUpdate.setNombre(producto.getNombre());
		productoUpdate.setTipo(producto.getTipo());
		productoUpdate.setCategoria(producto.getCategoria());
		productoUpdate.setDescripcion(producto.getDescripcion());
		productoUpdate.setPrecio_compra(producto.getPrecio_compra());
		productoUpdate.setPrecio_venta(producto.getPrecio_venta());
		productoUpdate.setActivo(producto.getActivo());
		
		return servicioProd.registrar(productoUpdate);
	}
	
	@DeleteMapping("/productos/{id}")
	public Producto delete(@PathVariable long id) {
		return servicioProd.delete(id);
	}
	
}
