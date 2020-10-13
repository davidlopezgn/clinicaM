package com.clinica.jpaclinica.jpa;


import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Paciente {

	@Id//generar llave primaria de la entidad
	@GeneratedValue(strategy=GenerationType.AUTO)//generar automaticamete auto increment
	@Column(name="PacienteId")
	private Long id;
	@Column(name="Nombre")
	private String name;
	@Column(name="Direccion")
	private String direccion;
	@Column(name="Correo")
	private String correo;
	@Column(name="Telefono")
	private String telefono;
	
	@OneToMany(mappedBy="paciente", cascade = CascadeType.ALL)//mappedBy="paciente" se crea objeto paciente en reservacion
	private Collection<Reservacion> recervaciones;//Collection<"nombre de clase">
	
	//Constructor
		public Paciente() {
			super();
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono= telefono;
	}

	@Override
	public String toString() {
		return "Paciente [getId()=" + this.getId() + ", getName()=" + this.getName() + ", getDireccion()=" + this.getDireccion()
				+ ", getCorreo()=" + this.getCorreo() + ", getTelefono()=" + this.getTelefono() + "]";
	}
	
}
