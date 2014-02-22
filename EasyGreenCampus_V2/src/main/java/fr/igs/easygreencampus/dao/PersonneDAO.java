package fr.igs.easygreencampus.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.igs.easygreencampus.model.Personne;

@Component("personneDAO")
public class PersonneDAO extends GenericDAO<Personne>  {
	public PersonneDAO() {
		super(Personne.class);
	}

	@SuppressWarnings("unchecked")
	public List<Personne> findAll() {
		return em.createNamedQuery("Personne.findAll").getResultList();
	}

	@SuppressWarnings("unchecked")
	public Personne findPersonneByMail(String mail) {
		return (Personne) em.createNamedQuery("Personne.findByMail")
				.setParameter("mailParam", mail).getSingleResult();
	}

}