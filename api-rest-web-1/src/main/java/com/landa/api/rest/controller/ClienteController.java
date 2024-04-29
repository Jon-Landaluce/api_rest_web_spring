package com.landa.api.rest.controller;

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

import com.landa.api.rest.entity.Cliente;
import com.landa.api.rest.service.ClienteService;

@RestController
@RequestMapping("/api") // añade un subruta antes de las rutas que yo le añado despues
public class ClienteController {
	
	@Autowired 
	private ClienteService servicio;
	
	//@PostMapping // subir datos
	//@PutMapping  // subir datos
	//@DeleteMapping // borrar datos
	
	// Metodo get que la lista de todos los registros
	@GetMapping("/clientes") // mostrar datos
	public List<Cliente> index(){
		return servicio.buscarTodos();
	}
	
	// metodo get que sevuelve un solo registro
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return servicio.buscarPorId(id);
	}
	
	// Metodo post para guardar un nuevo cliente
	@PostMapping("/clientes")
	public Cliente create(@RequestBody Cliente cliente) {
		return servicio.guardar(cliente);
	}

	// metodo put para actualizar un cliente existente
	
	@PutMapping("/clientes/{id}")
	public Cliente update(@PathVariable long id, @RequestBody Cliente cliente) {
		
		Cliente clienteUpdate = servicio.buscarPorId(id);
		
		clienteUpdate.setNombre(cliente.getNombre());
		clienteUpdate.setApellido(cliente.getApellido());
		clienteUpdate.setEmail(cliente.getEmail());
		clienteUpdate.setTelefono(cliente.getTelefono());
		clienteUpdate.setCreatedAt(cliente.getCreatedAt());
		
		return servicio.guardar(clienteUpdate);
	}
	
	// Metodo delete para borrar
	@DeleteMapping("/clientes/{id}")
	public Cliente delete (@PathVariable long id) {
		return servicio.delete(id);
		
	}
	
	

}
