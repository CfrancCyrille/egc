package fr.igs.easygreencampus.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.igs.easygreencampus.model.Personne;
import fr.igs.easygreencampus.model.Vehicule;
import fr.igs.easygreencampus.dao.*;

@Controller
public class InscriptionController {
	
	@Autowired
	private PersonneDAO PersonneDAO;
	
	@ModelAttribute("personne")
	 public Personne getPersonneObject() {
	  return new Personne();
	 }
	

	@RequestMapping(value = "inscription", method = RequestMethod.GET)
	public String inscription(@RequestParam Map<String, String> params, Model model) 
	{
		return "inscription";
	}
	
	@RequestMapping(value = "inscription", method = RequestMethod.POST)
	public String create(@ModelAttribute("personne") Personne personne, BindingResult result) {
		PersonneDAO.create(personne);
		return "redirect:inscription";
	}
}