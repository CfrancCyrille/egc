package fr.igs.easygreencampus.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value={""})
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		return "news/news";
		
	}
	
	
	// � chaque appel de l'index on r�cup�re les param�tres de l'URL
	@RequestMapping(value = "index")
	public String index(Model model) {

		return "index";
		
	}
	// mod n'est pas obligatoire -> param required=false
	/*public String menu(@RequestParam("page") String rubrique, @RequestParam(value="mod", required=false) String mod ) {

		String res= "";
		
		// on reconsruit la direction avec ajout du sous repertoire rubrique et du param�tre mod
		res = "redirect:/"+rubrique;
			
		// test et ajout du param�tre "mod" non obligatoire dans tous les cas d'appel ex : "maraicher" n'a pas de param�tre! 
		if(mod!=null && !mod.isEmpty()){
				res=res+"?mod="+mod;
		}	
	
		// on poste dans l'URL pour appeler la rubrique demand�e ex : "http://localhost:8080/igs/covoiturage?mod=search"
		return res;

		
	}*/
	
	
	
	
}
