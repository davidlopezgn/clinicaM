package com.clinica.jpaclinica.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservacion {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ReservacionId")
	private Long id;
	@Column(name="FechaHora")
	private String fechaHora;
	@Column(name="Tiempo") 			 //Duración de la consulta
	private String tiempo; 
	
	@OneToOne
	@JoinColumn(name="medico_id")
	private Medico medico;

	@Column(name="Consultorio")
	private String consultorio;		 // private Consultorio consultorio;

	@ManyToOne
	@JoinColumn(name = "agenda_id")
	private Agenda agenda;
	
	//---------------------------Constructors------------------------------
	
	public Reservacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//-------------------------Getters & Setters---------------------------
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}
	
	//-------------------------Methods----------------------------
	@Override
	public String toString() {
		return "Reservacion [getId()=" + this.getId() 
				+ ", getFechaHora()=" + this.getFechaHora()
				+ ", getMedico()=" + this.getMedico().getName() 
				+ ", getConsultorio()=" + this.getConsultorio() 
				+ ", getTiempo()=" + this.getTiempo();
	}
	
	
}
