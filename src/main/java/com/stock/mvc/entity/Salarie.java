package com.stock.mvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALARIE")
public class Salarie implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NOMSALARIE")
	private String nom;
	
	@Column(name="PRENOMSALARIE")
	private String prenom;
	
	@Column(name="NUMSECU")
	private int numSecu;
	
	

	public Salarie(String nom, String prenom, int numSecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numSecu = numSecu;
	}

	public Salarie() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(int numSecu) {
		this.numSecu = numSecu;
	}
	
	

}