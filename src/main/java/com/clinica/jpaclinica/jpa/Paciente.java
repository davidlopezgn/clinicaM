package com.clinica.jpaclinica.jpa;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Paciente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
