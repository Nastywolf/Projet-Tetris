package fr.formation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.tetris_dao.IAdminDAO;
import fr.formation.tetris_dao.IAuthentificationDAO;
import fr.formation.tetris_dao.IUserDAO;
import fr.formation.tetris_model_tetrimino.Admin;
import fr.formation.tetris_model_tetrimino.User;

@Controller
@RequestMapping(value="/connexion")
public class ConnexionController {

	@Autowired
	private IUserDAO daoUser;
	@Autowired
	private IAdminDAO daoAdmin;
	@Autowired
	private IAuthentificationDAO daoAuth;
	
	@ModelAttribute("page")
	public String page() {
		return "connexion";
	}
	
	@GetMapping("")
	public String connexion(Model model) {
	return "/connexion";
	}
	
	
//	@PostMapping("")
//	public String connexion(@Valid @ModelAttribute("connexion") Authentification auth,BindingResult result, Model model, HttpServletRequest req) {
//		
//		
//		for blabla
//		req.getParam("truc-" + qqch)
//		
//		
//		if(result.hasErrors()) {
//			return "connexion";
//		}
//		
//		return "redirect:./home";
//	}
	
	@PostMapping("")
	public String connexion(@Valid @ModelAttribute("login") String login, BindingResult result,
			@Valid @ModelAttribute("password") String password, BindingResult result2, Model model) {

		User j = daoUser.auth(login, password);
		Admin a = daoAdmin.auth(login, password);

		if (j != null) {
			model.addAttribute("utilisateur", daoUser.auth(login, password));
			System.out.println(j);
			return "redirect:./home";
		} else if (a != null) {
			model.addAttribute("utilisateur", daoAdmin.auth(login, password));
			System.out.println(j);
			return "redirect:./home";
		} else {

			return "connexion";
		}
	}
	
//	@PostMapping("/connect")
//	public String connect(@Valid @ModelAttribute("login") String login, BindingResult result,
//			@Valid @ModelAttribute("password") String password, BindingResult result2, Model model) {
//
//		Joueur j = daoJoueur.auth(login, password);
//		Admin a = daoAdmin.auth(login, password);
//
//		if (j != null) {
//			model.addAttribute("utilisateur", daoJoueur.auth(login, password));
//			System.out.println(j);
//			return "connected";
//		} else if (a != null) {
//			model.addAttribute("utilisateur", daoAdmin.auth(login, password));
//			System.out.println(j);
//			return "connected";
//		} else {
//
//			return "connect";
//		}
//	}
}
