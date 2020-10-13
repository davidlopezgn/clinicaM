package com.clinica.jpaclinica.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Consultorio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ConsultorioId")
	private Long id;
	@Column(name="Ubicacion")
	private String ubicacion;
	@Column(name="Estado")
	private String estado;
	@Column(name="Tipo")
	private String tipo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Consultorio [getId()=" + this.getId() + ", getUbicacion()=" + this.getUbicacion() + ", getEstado()=" + this.getEstado()
				+ ", getTipo()=" + this.getTipo() +  "]";
	}
}
