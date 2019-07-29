package com.stock.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SALAIRE")
public class Salaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="CONGESPAYE")
    private Float congésPayes;
	
	@Column(name="MONTANTINDEMNITE")
    private Float montantIndemnites;
	
	@Column(name="ELEMENTNONSOUMIISCOTISATION")
    private Float elementNonSoumisCotisation;
	
	@Column(name="MONTANTVERSEMENT")
    private Float montantVersement;
	
	@Column(name="DATEVERSEMENT")
    private String dateVersement;
	
	@Column(name="NETAPAYE")
    private Float netAPaye;
	
	@Column(name="DATENETAPAYE")
    private String dateNetAPaye;
	
	@Column(name = "IDEMPLOYEUR", nullable = false)
	private Employeur idemployeur;
	
	

	public Salaire(Float congésPayes, Float montantIndemnites, Float elementNonSoumisCotisation, Float montantVersement,
			String dateVersement, Float netAPaye, String dateNetAPaye) {
		super();
		this.congésPayes = congésPayes;
		this.montantIndemnites = montantIndemnites;
		this.elementNonSoumisCotisation = elementNonSoumisCotisation;
		this.montantVersement = montantVersement;
		this.dateVersement = dateVersement;
		this.netAPaye = netAPaye;
		this.dateNetAPaye = dateNetAPaye;
	}
	
	public Salaire() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Float getCongésPayes() {
		return congésPayes;
	}

	public void setCongésPayes(Float congésPayes) {
		this.congésPayes = congésPayes;
	}

	public Float getMontantIndemnites() {
		return montantIndemnites;
	}

	public void setMontantIndemnites(Float montantIndemnites) {
		this.montantIndemnites = montantIndemnites;
	}

	public Float getElementNonSoumisCotisation() {
		return elementNonSoumisCotisation;
	}

	public void setElementNonSoumisCotisation(Float elementNonSoumisCotisation) {
		this.elementNonSoumisCotisation = elementNonSoumisCotisation;
	}

	public Float getMontantVersement() {
		return montantVersement;
	}

	public void setMontantVersement(Float montantVersement) {
		this.montantVersement = montantVersement;
	}

	public String getDateVersement() {
		return dateVersement;
	}

	public void setDateVersement(String dateVersement) {
		this.dateVersement = dateVersement;
	}

	public Float getNetAPaye() {
		return netAPaye;
	}

	public void setNetAPaye(Float netAPaye) {
		this.netAPaye = netAPaye;
	}

	public String getDateNetAPaye() {
		return dateNetAPaye;
	}

	public void setDateNetAPaye(String dateNetAPaye) {
		this.dateNetAPaye = dateNetAPaye;
	}
	
	

}
