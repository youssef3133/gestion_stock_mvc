package com.stock.mvc.entity;

import java.math.BigDecimal;

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
@Table(name = "RETRAITE")
public class Retraite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="SECUPLAFONNE")
    private BigDecimal secuPlafonne;
	
	@Column(name="SECUDEPLAFONNE")
    private BigDecimal secuDeplafonne;
	
	@Column(name="COMPLEMENTT1")
    private BigDecimal complementT1;
	
	@Column(name="COMPLEMENTT2")
    private BigDecimal complementT2;
	
	@Column(name="SUPPLEMENTAIRE")
    private BigDecimal supplementaire;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "retraite_idSalaire", unique=true)
	private Salaire salaire;

	public Retraite(BigDecimal secuPlafonne, BigDecimal secuDeplafonne, BigDecimal complementT1, BigDecimal complementT2,
			BigDecimal supplementaire) {
		super();
		this.secuPlafonne = secuPlafonne;
		this.secuDeplafonne = secuDeplafonne;
		this.complementT1 = complementT1;
		this.complementT2 = complementT2;
		this.supplementaire = supplementaire;
	}

	public Retraite() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getSecuPlafonne() {
		return secuPlafonne;
	}

	public void setSecuPlafonne(BigDecimal secuPlafonne) {
		this.secuPlafonne = secuPlafonne;
	}

	public BigDecimal getSecuDeplafonne() {
		return secuDeplafonne;
	}

	public void setSecuDeplafonne(BigDecimal secuDeplafonne) {
		this.secuDeplafonne = secuDeplafonne;
	}

	public BigDecimal getComplementT1() {
		return complementT1;
	}

	public void setComplementT1(BigDecimal complementT1) {
		this.complementT1 = complementT1;
	}

	public BigDecimal getComplementT2() {
		return complementT2;
	}

	public void setComplementT2(BigDecimal complementT2) {
		this.complementT2 = complementT2;
	}

	public BigDecimal getSupplementaire() {
		return supplementaire;
	}

	public void setSupplementaire(BigDecimal supplementaire) {
		this.supplementaire = supplementaire;
	}
	
	
	
	

}
