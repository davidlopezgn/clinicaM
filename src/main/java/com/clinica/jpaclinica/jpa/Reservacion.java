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

	@ManyToOne
	@JoinColumn(name = "agenda_id")
	private Agenda agenda;
	
	@ManyToOne
	@JoinColumn(name = "paciente_id")//llave foranea que recibe de paciente
	private Paciente paciente;//crea objeto paciente
	
	@ManyToOne
	@JoinColumn(name = "consultorio_id")
	private Consultorio consultorio;
	
	
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

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
	
	//-------------------------Methods----------------------------
	@Override
	public String toString() {
		return "Reservacion [getId()=" + this.getId() 
				+ ", getFechaHora()=" + this.getFechaHora() 
				+ ", getConsultorio()=" + this.getConsultorio() 
				+ ", getTiempo()=" + this.getTiempo();
	}
	
	
}
