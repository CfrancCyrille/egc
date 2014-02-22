package fr.igs.easygreencampus.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the annonce database table.
 * 
 */
@Entity
@NamedQuery(name="Annonce.findAll", query="SELECT a FROM Annonce a")
public class Annonce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAnnonce;

	private String adresseAnnonce;

	private String affichageCoordonnees;

	private int categorie_idCategorie;

	private int codePostalAnnonce;

	@Temporal(TemporalType.DATE)
	private Date dateDebut;

	@Temporal(TemporalType.DATE)
	private Date dateFin;

	private String description;

	private int personne_idPersonne;

	private float prix;

	private String titre;

	private int transaction_idTransaction;

	private String villeAnnonce;

	public Annonce() {
	}

	public int getIdAnnonce() {
		return this.idAnnonce;
	}

	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public String getAdresseAnnonce() {
		return this.adresseAnnonce;
	}

	public void setAdresseAnnonce(String adresseAnnonce) {
		this.adresseAnnonce = adresseAnnonce;
	}

	public String getAffichageCoordonnees() {
		return this.affichageCoordonnees;
	}

	public void setAffichageCoordonnees(String affichageCoordonnees) {
		this.affichageCoordonnees = affichageCoordonnees;
	}

	public int getCategorie_idCategorie() {
		return this.categorie_idCategorie;
	}

	public void setCategorie_idCategorie(int categorie_idCategorie) {
		this.categorie_idCategorie = categorie_idCategorie;
	}

	public int getCodePostalAnnonce() {
		return this.codePostalAnnonce;
	}

	public void setCodePostalAnnonce(int codePostalAnnonce) {
		this.codePostalAnnonce = codePostalAnnonce;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPersonne_idPersonne() {
		return this.personne_idPersonne;
	}

	public void setPersonne_idPersonne(int personne_idPersonne) {
		this.personne_idPersonne = personne_idPersonne;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getTransaction_idTransaction() {
		return this.transaction_idTransaction;
	}

	public void setTransaction_idTransaction(int transaction_idTransaction) {
		this.transaction_idTransaction = transaction_idTransaction;
	}

	public String getVilleAnnonce() {
		return this.villeAnnonce;
	}

	public void setVilleAnnonce(String villeAnnonce) {
		this.villeAnnonce = villeAnnonce;
	}

}