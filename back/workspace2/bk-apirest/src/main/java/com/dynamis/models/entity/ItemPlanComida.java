package com.dynamis.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="plan_comida_items")
public class ItemPlanComida implements Serializable{
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Integer cantidad;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "alimento_id")
	private Alimento alimento;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="comida_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" })
	private Comida comida;
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Integer getCantidad() {
		return cantidad;
	}




	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getCalorias() {
		return cantidad.doubleValue() * alimento.getCaloria();
	}



	public Alimento getAlimento() {
		return alimento;
	}




	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}




	public Comida getComida() {
		return comida;
	}




	public void setComida(Comida comida) {
		this.comida = comida;
	}




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
