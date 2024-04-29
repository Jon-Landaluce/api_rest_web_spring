package com.landa.api.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.landa.api.rest.entity.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long> {

}
