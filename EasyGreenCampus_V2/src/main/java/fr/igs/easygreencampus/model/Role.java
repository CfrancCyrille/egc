package fr.igs.easygreencampus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
@Table(name="role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idRole;

	private String nomRole;

	public Role() {
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}


}