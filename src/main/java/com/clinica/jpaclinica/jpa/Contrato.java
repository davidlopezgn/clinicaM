package com.clinica.jpaclinica.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrato {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ContratoId")
	private Long id;
	@Column(name="FechaInicial")
	private String initialDate;
	@Column(name="FechaFinal")
	private String finalDate;
	
	@ManyToOne
	@JoinColumn(name="medico_id")
	private Medico medico;
	
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plan plan;
	
	public Contrato() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
	public String getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
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
		return "Contrato [getId()=" + this.getId() + ", getInitialDate()=" + this.getInitialDate() + ", getFinalDate()="
				+ this.getFinalDate() + ", getMedico()=" + this.getMedico() + ", getPlan()=" + this.getPlan() + "]";
	}
}
