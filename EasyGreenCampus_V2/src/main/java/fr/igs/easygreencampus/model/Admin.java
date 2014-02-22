package fr.igs.easygreencampus.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
@NamedQuery(name="Admin.findAll", query="SELECT a FROM Admin a")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAdmin;

	private int delaiRelanceCovoiturage;

	private int delaiRelanceDivers;

	private int delaiRelanceElectromenager;

	private int delaiRelanceLivre;

	private int delaiRelanceLogement;

	private int delaiRelanceMeuble;

	private int delaiRelanceService;

	private int delaiRelanceVehicule;

	private int dureeConservationCovoiturage;

	private int dureeConservationDivers;

	private int dureeConservationElectromenager;

	private int dureeConservationLivre;

	private int dureeConservationLogement;

	private int dureeConservationMeuble;

	private int dureeConservationService;

	private int dureeConservationVehicule;

	public Admin() {
	}

	public int getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public int getDelaiRelanceCovoiturage() {
		return this.delaiRelanceCovoiturage;
	}

	public void setDelaiRelanceCovoiturage(int delaiRelanceCovoiturage) {
		this.delaiRelanceCovoiturage = delaiRelanceCovoiturage;
	}

	public int getDelaiRelanceDivers() {
		return this.delaiRelanceDivers;
	}

	public void setDelaiRelanceDivers(int delaiRelanceDivers) {
		this.delaiRelanceDivers = delaiRelanceDivers;
	}

	public int getDelaiRelanceElectromenager() {
		return this.delaiRelanceElectromenager;
	}

	public void setDelaiRelanceElectromenager(int delaiRelanceElectromenager) {
		this.delaiRelanceElectromenager = delaiRelanceElectromenager;
	}

	public int getDelaiRelanceLivre() {
		return this.delaiRelanceLivre;
	}

	public void setDelaiRelanceLivre(int delaiRelanceLivre) {
		this.delaiRelanceLivre = delaiRelanceLivre;
	}

	public int getDelaiRelanceLogement() {
		return this.delaiRelanceLogement;
	}

	public void setDelaiRelanceLogement(int delaiRelanceLogement) {
		this.delaiRelanceLogement = delaiRelanceLogement;
	}

	public int getDelaiRelanceMeuble() {
		return this.delaiRelanceMeuble;
	}

	public void setDelaiRelanceMeuble(int delaiRelanceMeuble) {
		this.delaiRelanceMeuble = delaiRelanceMeuble;
	}

	public int getDelaiRelanceService() {
		return this.delaiRelanceService;
	}

	public void setDelaiRelanceService(int delaiRelanceService) {
		this.delaiRelanceService = delaiRelanceService;
	}

	public int getDelaiRelanceVehicule() {
		return this.delaiRelanceVehicule;
	}

	public void setDelaiRelanceVehicule(int delaiRelanceVehicule) {
		this.delaiRelanceVehicule = delaiRelanceVehicule;
	}

	public int getDureeConservationCovoiturage() {
		return this.dureeConservationCovoiturage;
	}

	public void setDureeConservationCovoiturage(int dureeConservationCovoiturage) {
		this.dureeConservationCovoiturage = dureeConservationCovoiturage;
	}

	public int getDureeConservationDivers() {
		return this.dureeConservationDivers;
	}

	public void setDureeConservationDivers(int dureeConservationDivers) {
		this.dureeConservationDivers = dureeConservationDivers;
	}

	public int getDureeConservationElectromenager() {
		return this.dureeConservationElectromenager;
	}

	public void setDureeConservationElectromenager(int dureeConservationElectromenager) {
		this.dureeConservationElectromenager = dureeConservationElectromenager;
	}

	public int getDureeConservationLivre() {
		return this.dureeConservationLivre;
	}

	public void setDureeConservationLivre(int dureeConservationLivre) {
		this.dureeConservationLivre = dureeConservationLivre;
	}

	public int getDureeConservationLogement() {
		return this.dureeConservationLogement;
	}

	public void setDureeConservationLogement(int dureeConservationLogement) {
		this.dureeConservationLogement = dureeConservationLogement;
	}

	public int getDureeConservationMeuble() {
		return this.dureeConservationMeuble;
	}

	public void setDureeConservationMeuble(int dureeConservationMeuble) {
		this.dureeConservationMeuble = dureeConservationMeuble;
	}

	public int getDureeConservationService() {
		return this.dureeConservationService;
	}

	public void setDureeConservationService(int dureeConservationService) {
		this.dureeConservationService = dureeConservationService;
	}

	public int getDureeConservationVehicule() {
		return this.dureeConservationVehicule;
	}

	public void setDureeConservationVehicule(int dureeConservationVehicule) {
		this.dureeConservationVehicule = dureeConservationVehicule;
	}

}