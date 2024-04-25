package com.landa.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.landa.api.rest.dao.ClienteDao;
import com.landa.api.rest.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
