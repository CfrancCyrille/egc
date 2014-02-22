package fr.igs.easygreencampus.model;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the trajet database table.
 * 
 */
@Entity
//@NamedQueries({
@NamedQuery(name="Trajet.findAll", query="SELECT t FROM Trajet t")
//@NamedQuery(name="Trajet.findByTown", query="SELECT t FROM Trajet t WHERE t.Localisation_arrivee = :Localisation_arrivee")


public class Trajet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTrajet;

	private int conducteur_idConducteur; 

	private float cout;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Temporal(TemporalType.TIMESTAMP)
	private Date heure;

	private int localisation_arrivee;

	private int localisation_depart;

	private int localisation_etape1;

	private int localisation_etape2;

	private int localisation_etape3;

	private int nbPlace;

	private String remarque;

	public Trajet() {
	}

	public int getIdTrajet() {
		return this.idTrajet;
	}

	public void setIdTrajet(int idTrajet) {
		this.idTrajet = idTrajet;
	}

	public int getConducteur_idConducteur() {
		return this.conducteur_idConducteur;
	}

	public void setConducteur_idConducteur(int conducteur_idConducteur) {
		this.conducteur_idConducteur = conducteur_idConducteur;
	}

	public float getCout() {
		return this.cout;
	}

	public void setCout(float cout) {
		this.cout = cout;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHeure() {
		return this.heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

	public int getLocalisation_arrivee() {
		return this.localisation_arrivee;
	}

	public void setLocalisation_arrivee(int localisation_arrivee) {
		this.localisation_arrivee = localisation_arrivee;
	}

	public int getLocalisation_depart() {
		return this.localisation_depart;
	}

	public void setLocalisation_depart(int localisation_depart) {
		this.localisation_depart = localisation_depart;
	}

	public int getLocalisation_etape1() {
		return this.localisation_etape1;
	}

	public void setLocalisation_etape1(int localisation_etape1) {
		this.localisation_etape1 = localisation_etape1;
	}

	public int getLocalisation_etape2() {
		return this.localisation_etape2;
	}

	public void setLocalisation_etape2(int localisation_etape2) {
		this.localisation_etape2 = localisation_etape2;
	}

	public int getLocalisation_etape3() {
		return this.localisation_etape3;
	}

	public void setLocalisation_etape3(int localisation_etape3) {
		this.localisation_etape3 = localisation_etape3;
	}

	public int getNbPlace() {
		return this.nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

	public String getRemarque() {
		return this.remarque;
	}

	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}

}