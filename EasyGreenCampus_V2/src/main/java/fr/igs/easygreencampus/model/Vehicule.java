package fr.igs.easygreencampus.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vehicule database table.
 * 
 */
@Entity
@NamedQuery(name="Vehicule.findAll", query="SELECT v FROM Vehicule v")

public class Vehicule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVehicule;

	private String commentaire;

	private int conducteur_idConducteur;

	private String couleur;

	private String marque;

	private String modele;

	private int nbPlace;

	public Vehicule() {
	}

	public int getIdVehicule() {
		return this.idVehicule;
	}

	public void setIdVehicule(int idVehicule) {
		this.idVehicule = idVehicule;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getConducteur_idConducteur() {
		return this.conducteur_idConducteur;
	}

	public void setConducteur_idConducteur(int conducteur_idConducteur) {
		this.conducteur_idConducteur = conducteur_idConducteur;
	}

	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getMarque() {
		return this.marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getNbPlace() {
		return this.nbPlace;
	}

	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}

}