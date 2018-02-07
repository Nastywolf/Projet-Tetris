package fr.formation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@ModelAttribute("page")
	public String page() {
		return "acceuil";
	}
	
	@GetMapping("")
	public String home( Model model) {
	return "home";
	}
}
