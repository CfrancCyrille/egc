package fr.igs.easygreencampus.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.igs.easygreencampus.model.Vehicule;

	
@Component("vehiculeDAO")

public class VehiculeDAO extends GenericDAO<Vehicule> {
	public VehiculeDAO(){
		super(Vehicule.class);
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Vehicule> findAll() {
		return em.createNamedQuery("Vehicule.findAll").getResultList();
	}
	
}




