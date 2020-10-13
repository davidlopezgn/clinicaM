package com.clinica.jpaclinica.jpa;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Medico {
//	@NamedQuery(name="Medicos.getAll", query="SELECT m FROM Medico m")

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MedicoId")
	private Long id;
	@Column(name="Nombre")
	private String name;
	@Column(name="Apellido")
	private String lastName;
	@Column(name="Especialidad")
	private String speciality;
	@Column(name="Cedula")
	private String license;
	
	@OneToOne
	@JoinColumn(name="agenda_id")
	private Agenda agenda;
	
	@OneToMany(mappedBy="medico", cascade = CascadeType.ALL)
	private Collection<Contrato> contratos;
	
	@OneToOne(mappedBy = "medico")
	private Reservacion reservacion;
	
	public Medico() { super(); }

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Collection<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(Collection<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	@Override
	public String toString() {
		return "Medico [getId()=" + this.getId() + ", getName()=" + this.getName() + ", getLastName()=" + this.getLastName()
				+ ", getSpeciality()=" + this.getSpeciality() + ", getLicense()=" + this.getLicense() + ", getContratos()="
				+ this.getContratos() + ", getAgenda()= " + this.getAgenda() + "]";
	}
	
	
	
	
	
}
