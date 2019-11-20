package com.dynamis.behealthy.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;





@Entity
@Table(name="alimentos")

public class Alimento implements Serializable{

	


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	
	private String nombre;
	private String descripcion;
	
	
	private Double caloria;
	
	private Double carbohidratos;
	private Double proteinas;
	private Double grasas;
	private Double fibra;

	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	



	public Double getCaloria() {
		return caloria;
	}



	public void setCaloria(Double caloria) {
		this.caloria = caloria;
	}

	

	public Double getCarbohidratos() {
		return carbohidratos;
	}



	public void setCarbohidratos(Double carbohidratos) {
		this.carbohidratos = carbohidratos;
	}



	public Double getProteinas() {
		return proteinas;
	}



	public void setProteinas(Double proteinas) {
		this.proteinas = proteinas;
	}



	public Double getGrasas() {
		return grasas;
	}



	public void setGrasas(Double grasas) {
		this.grasas = grasas;
	}



	public Double getFibra() {
		return fibra;
	}



	public void setFibra(Double fibra) {
		this.fibra = fibra;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
