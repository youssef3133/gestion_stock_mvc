package com.stock.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REMUNERATIONBRUT")
public class RemunerationBrut {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="SALAIREDEBASE")
    double salaireDeBase;
	
	@Column(name="ABSENCENONREMUNERE")
    private double absenceNonRemunere;
	
	@Column(name="HEURESUPP")
    private double heureSupp;
	
	@Column(name="INDEMNITENONSOUMISE")
    private double indemniteNonSoumise;
	
	@Column(name="PRIMES")
    private double primes;

	public RemunerationBrut(double salaireDeBase, double absenceNonRemunere, double heureSupp,
			double indemniteNonSoumise, double primes) {
		super();
		this.salaireDeBase = salaireDeBase;
		this.absenceNonRemunere = absenceNonRemunere;
		this.heureSupp = heureSupp;
		this.indemniteNonSoumise = indemniteNonSoumise;
		this.primes = primes;
	}
	
	public RemunerationBrut() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalaireDeBase() {
		return salaireDeBase;
	}

	public void setSalaireDeBase(double salaireDeBase) {
		this.salaireDeBase = salaireDeBase;
	}

	public double getAbsenceNonRemunere() {
		return absenceNonRemunere;
	}

	public void setAbsenceNonRemunere(double absenceNonRemunere) {
		this.absenceNonRemunere = absenceNonRemunere;
	}

	public double getHeureSupp() {
		return heureSupp;
	}

	public void setHeureSupp(double heureSupp) {
		this.heureSupp = heureSupp;
	}

	public double getIndemniteNonSoumise() {
		return indemniteNonSoumise;
	}

	public void setIndemniteNonSoumise(double indemniteNonSoumise) {
		this.indemniteNonSoumise = indemniteNonSoumise;
	}

	public double getPrimes() {
		return primes;
	}

	public void setPrimes(double primes) {
		this.primes = primes;
	}
	
	
	

}
