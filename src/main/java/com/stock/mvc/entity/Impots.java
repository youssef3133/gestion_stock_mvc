package com.stock.mvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IMPOTS")
public class Impots {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="NETAVANTIMPOT")
    private double netAvantImpot;
	
	@Column(name="TOTALVERSEEMPLOYEUR")
    private double totalVerseEmployeur;
	
	@Column(name="IMPOTSURREVENUE")
    private double impotSurRevenu;
	
	@Column(name="IMPOTPRELEVESOURCE")
    private double impotPreleveALaSource;
	
	@Column(name="TXPERSONALISE")
    private double tx_personalise;
	
	@Column(name="BASEIMPOT")
    private double baseImpot;
	
	@Column(name="MONTANTPRELEVEIMPOT")
    private static double montantPrelevImpot;

	public Impots(double netAvantImpot, double totalVerseEmployeur, double impotSurRevenu, double impotPreleveALaSource,
			double tx_personalise, double baseImpot) {
		super();
		this.netAvantImpot = netAvantImpot;
		this.totalVerseEmployeur = totalVerseEmployeur;
		this.impotSurRevenu = impotSurRevenu;
		this.impotPreleveALaSource = impotPreleveALaSource;
		this.tx_personalise = tx_personalise;
		this.baseImpot = baseImpot;
	}
	
	public Impots() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getNetAvantImpot() {
		return netAvantImpot;
	}

	public void setNetAvantImpot(double netAvantImpot) {
		this.netAvantImpot = netAvantImpot;
	}

	public double getTotalVerseEmployeur() {
		return totalVerseEmployeur;
	}

	public void setTotalVerseEmployeur(double totalVerseEmployeur) {
		this.totalVerseEmployeur = totalVerseEmployeur;
	}

	public double getImpotSurRevenu() {
		return impotSurRevenu;
	}

	public void setImpotSurRevenu(double impotSurRevenu) {
		this.impotSurRevenu = impotSurRevenu;
	}

	public double getImpotPreleveALaSource() {
		return impotPreleveALaSource;
	}

	public void setImpotPreleveALaSource(double impotPreleveALaSource) {
		this.impotPreleveALaSource = impotPreleveALaSource;
	}

	public double getTx_personalise() {
		return tx_personalise;
	}

	public void setTx_personalise(double tx_personalise) {
		this.tx_personalise = tx_personalise;
	}

	public double getBaseImpot() {
		return baseImpot;
	}

	public void setBaseImpot(double baseImpot) {
		this.baseImpot = baseImpot;
	}

	public static double getMontantPrelevImpot() {
		return montantPrelevImpot;
	}

	public static void setMontantPrelevImpot(double montantPrelevImpot) {
		Impots.montantPrelevImpot = montantPrelevImpot;
	}
	
	

}
