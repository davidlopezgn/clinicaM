package com.clinica.jpaclinica.jpa;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agenda {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AgendaId")
	private Long id;
	
	@OneToOne(mappedBy = "agenda")
	private Medico medico;
	
	@OneToMany(mappedBy = "agenda")
	private Collection<Reservacion> reservaciones;
	
	public Agenda() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	@Override
	public String toString() {
		return "Agenda [getId()=" + this.getId() + "]";
	}
	
	
	
}
