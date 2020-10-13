package com.clinica.jpaclinica.jpa;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Recibo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Folio")
	private Long id;
	@Column(name="Fecha")
	private String fecha;
	@Column(name="Monto")
	private Float monto;
	@Column(name="Periodo")
	private String periodo;
	
	@ManyToOne
	@JoinColumn(name="medico_id")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plan plan;
	
	
	//---------------------------Constructors----------------------------------
	public Recibo() {
		super();
	}


	//----------------------------Setters & Getters----------------------------

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Float getMonto() {
		return monto;
	}


	public void setMonto(Float monto) {
		this.monto = monto;
	}


	public String getPeriodo() {
		return periodo;
	}


	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Plan getPlan() {
		return plan;
	}


	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	

	@Override
	public String toString() {
		return "Recibo [getId() = " + this.getId() 
				+ ", getMedico() = " + this.getMedico().getName() 
				+ ", getFecha() = " + this.getFecha()
				+ ", getPlan() = " + this.getPlan().getType() 
				+ ", getMonto() = " + this.getMonto() 
				+ ", getPeriodo() = " + this.getPeriodo() ;
	}
	
	
	


}
