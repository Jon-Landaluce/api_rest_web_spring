package com.landa.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landa.api.rest.dao.ClienteDao;
import com.landa.api.rest.entity.Cliente;


@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;
	
	// evalua si hay un cambio en tu base de datos y si no lo hay no revisa 
	// todos los registros readOnly solo para los get
	
	@Override
	@Transactional(readOnly = true) // para optimizar los get
	public List<Cliente> buscarTodos() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)// optimizar el guardado
	public Cliente buscarPorId(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente guardar(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public Cliente delete(Long id) {
		Cliente clienteBorrado = clienteDao.findById(id).orElse(null);
		clienteDao.deleteById(id);
		
		return clienteBorrado;
		
		
	}
	
	

}
