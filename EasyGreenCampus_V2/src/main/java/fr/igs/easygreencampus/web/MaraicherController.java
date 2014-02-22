package fr.igs.easygreencampus.web;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;



@Controller
@SessionAttributes
public class MaraicherController {
	
	
	//public String menuMaraicher(@RequestParam("mod") String mod, Model model) {
	@RequestMapping(value="/maraicher", method=RequestMethod.GET)
	public String menuMaraicher(Model model) {
	//return "/jsp/pages/maraicher/"+sousrubrique;	
		
	model.addAttribute("rep", "maraicher");

//    model.addAttribute("listeMaraicher", "<option value='ID1'>Maraicher du coin</option>"
//    		+ "<option value='ID2'>Maraicher de plus loin</option>"
//    		+ "<option value='ID3'>Maraicher de l autre bout de la france</option>");
 
	

//	List <String> tabmar = null;
//	
//	tabmar.add("maraicher1");
//	tabmar.add("maraicher2");
//	tabmar.add("maraicher3");
//		
//	((ModelAndView) model).addObject("SEARCH_LIST_MARAICHERS", tabmar);


	boolean isAdmin = true;

	if(isAdmin)
	model.addAttribute("page", "new");
	else
	model.addAttribute("page", "list");

	return "index";
	}

	
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
    public String addMaraicher(@ModelAttribute("maraicher") Maraichers maraicher1, BindingResult result, Model model){
         
        System.out.println("First Name:" + maraicher1.getFirstname() +
                    "Last Name:" + maraicher1.getLastname());
        

        
        model.addAttribute("page", "new");
         
        return "index";
        //return "redirect:list";
    }
     
    @RequestMapping("/list")
    public ModelAndView showMaraichers(Model model) {

    	return new ModelAndView("maraicher", "command", new Maraichers());
    }
	

	
}
