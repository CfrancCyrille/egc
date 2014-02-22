package fr.igs.easygreencampus.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.igs.easygreencampus.dao.PersonneDAO;
import fr.igs.easygreencampus.model.Personne;
@Service("userDetailsService")
@Transactional(readOnly=true)
public class UserDetailsServiceAdapter implements UserDetailsService {
	@Autowired
	PersonneDAO personneDAO;

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		// The username used to log in is the email of the personne
		Personne personne = personneDAO.findPersonneByMail(userName);
		if (personne == null) {
			throw new UsernameNotFoundException("Utilisateur non trouvé.");
		} else if (personne.getRoles().isEmpty()) {
			throw new UsernameNotFoundException(
					"L'uUtilisateur n'a pas de role");
		}
		UserDetailsAdapter user = new UserDetailsAdapter(personne);
		user.setPassword(personne.getMotDePasse());
		return user;
	}
}
