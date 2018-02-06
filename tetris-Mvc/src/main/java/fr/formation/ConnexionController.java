package fr.formation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/connexion")
public class ConnexionController {

	
	@GetMapping
	public String home(@PathVariable(required=false) String username, @RequestParam(required=false, defaultValue="0") int idProduit, Model model) {
	return "connexion";
	}
}
