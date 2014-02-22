package fr.igs.easygreencampus.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
@NamedQueries({
		@NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p"),
		@NamedQuery(name = "Personne.findByMail", query = "SELECT p FROM Personne p where p.mail=:mailParam") })
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPersonne;

	private String adresse;

	private int codePostal;

	@Temporal(TemporalType.DATE)
	private Date dateInscription;

	@Temporal(TemporalType.DATE)
	private Date dateNaissance;

	//private byte interneIGS;

	private String mail;

	private String motDePasse;

	private String nom;

	private String prenom;

	private byte sexe;

	private String tel;

	private String ville;

	@JoinTable(name = "personneRoleAssociation", joinColumns = { @JoinColumn(name = "idPersonne", referencedColumnName = "idPersonne") }, inverseJoinColumns = { @JoinColumn(name = "idRole", referencedColumnName = "idRole") })
	@ManyToMany
	private List<Role> roles;

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Personne() {
	}

	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Date getDateInscription() {
		return this.dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
/*
	public byte getInterneIGS() {
		return this.interneIGS;
	}

	public void setInterneIGS(byte interneIGS) {
		this.interneIGS = interneIGS;
	}
*/
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public byte getSexe() {
		return this.sexe;
	}

	public void setSexe(byte sexe) {
		this.sexe = sexe;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}