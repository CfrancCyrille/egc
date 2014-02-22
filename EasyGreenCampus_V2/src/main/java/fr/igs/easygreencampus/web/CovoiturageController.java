package fr.igs.easygreencampus.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.igs.easygreencampus.dao.VehiculeDAO;
import fr.igs.easygreencampus.model.Vehicule;

@Controller
public class CovoiturageController {
	@Autowired
	private VehiculeDAO vehiculeDAO;

	@ModelAttribute("vehicule")
	 public Vehicule getVEhiculeObject() {
	  return new Vehicule();
	 }
	
	/**
     * The request mapping is for menu (covoiturage/myCar is the value from the menu.)
     */
	
	@RequestMapping(value = "covoiturage/covoiturage", method = RequestMethod.GET)
	public String covoiturage(@RequestParam Map<String, String> params, Model model) {
	    
        model.addAttribute("vehicule", new Vehicule());
		return "covoiturage/covoiturage";
	}

	@RequestMapping(value = "covoiturage/myCar", method = RequestMethod.GET)
	public String get(@RequestParam Map<String, String> params, Model model) {

		return "covoiturage/myCar";
	}

	@Transactional
	@RequestMapping(value = "covoiturage/myCar", method = RequestMethod.POST)
	public String create(@ModelAttribute("vehicule") Vehicule vehicule, BindingResult result) {

		vehiculeDAO.create(vehicule);
		
		return "covoiturage/myCar";
	}

	
}
