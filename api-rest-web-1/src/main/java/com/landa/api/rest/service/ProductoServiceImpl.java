package com.landa.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.landa.api.rest.dao.ProductoDao;
import com.landa.api.rest.entity.Producto;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> buscarTodos() {
		return (List<Producto>) productoDao.findAll() ;
	}

	@Override
	@Transactional
	public Producto buscarPorId(Long id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto registrar(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional
	public Producto delete(Long id) {
		Producto productoBorrado = productoDao.findById(id).orElse(null);
		productoDao.deleteById(id);
		
		return productoBorrado;
	}
	
	

}
