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
public class Plan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PlanId")
	private Long id;
	@Column(name="Tipo")
	private String type;
	@Column(name="Costo")
	private Float price;
	
	@OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
	private Collection<Contrato> contratos;
	
	@OneToMany(mappedBy = "plan", cascade = CascadeType.ALL)
	private Collection<Recibo> recibos;

	public Plan() { super();}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Collection<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(Collection<Contrato> contratos) {
		this.contratos = contratos;
	}

	@Override
	public String toString() {
		return "Plan [getId()=" + this.getId() + ", getType()=" + this.getType() + ", getPrice()=" + this.getPrice()
				+ ", getContratos()=" + this.getContratos() + "]";
	}
	
	
	
}
