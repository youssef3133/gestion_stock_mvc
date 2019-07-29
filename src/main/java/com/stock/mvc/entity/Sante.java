package com.stock.mvc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SANTE")
public class Sante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="SECUSOCIAL")
    private int secuSocial;
	
	@Column(name="COMPLEMENTAIRESANTE")
    private double complementaireSante;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "sante_idSalaire", unique = true)
	private Salaire salaire;

	public Sante(int secuSocial, double complementaireSante) {
		super();
		this.secuSocial = secuSocial;
		this.complementaireSante = complementaireSante;
	}

	public Sante() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSecuSocial() {
		return secuSocial;
	}

	public void setSecuSocial(int secuSocial) {
		this.secuSocial = secuSocial;
	}

	public double getComplementaireSante() {
		return complementaireSante;
	}

	public void setComplementaireSante(double complementaireSante) {
		this.complementaireSante = complementaireSante;
	}
	
	
	
	

}
