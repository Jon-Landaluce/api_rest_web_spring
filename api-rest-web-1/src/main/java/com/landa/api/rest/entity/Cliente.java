package com.landa.api.rest.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // Esto es una entidad y y mapea
@Table(name="cliente") // definimos el nombre que va a tener la tabla
public class Cliente implements Serializable {
	
	// esta clase se traduce directamente a la tabla que tenemos en el servidos de Xampp
	// implementamos Serializable y para darle un caracter unico parando encima de cliente
	// agregamos un identificador unico y LO DEJAMOS AL FINALD DE LA CLASE!!
	
	@Id // Marca como Id el inmediatamente posterior (solo funciona dentro de Entity)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremental (solo funciona dentro de Entity)
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	@Column(name="fecha_creacion") // definimos otro nombre cuando se crea en la base de datos
	@Temporal(TemporalType.DATE) // para que solo te de la fecha y no fecha y hora
	private Date createdAt; // el CamelCase traduce a la base de datos como "created_at"
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	private static final long serialVersionUID = 1L;
	

}
