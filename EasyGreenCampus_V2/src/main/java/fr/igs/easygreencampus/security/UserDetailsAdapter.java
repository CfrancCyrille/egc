package fr.igs.easygreencampus.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;

import fr.igs.easygreencampus.model.Personne;
import fr.igs.easygreencampus.model.Role;

/**
 * 
 * @author deborahlivet
 * 
 *         Classe permettant de mapper la classe personne vers la classe
 *         userDetails de spring
 */
public class UserDetailsAdapter implements UserDetails {
	private Personne personne;
	private String password;

	public UserDetailsAdapter(Personne personne) {
		this.setPersonne(personne);
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (Role role : personne.getRoles()){
			authorities.add(new GrantedAuthorityImpl(role.getNomRole()));
		}
		return authorities;
	}

	@Override
	public String getUsername() {
		// le userName utilisé comme login correspond à l'email de la personne
		return personne.getMail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
