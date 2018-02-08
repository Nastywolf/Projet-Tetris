package fr.formation;

import javax.servlet.http.HttpSession;
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
import fr.formation.tetris_model_tetrimino.Authentification;
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
	public String connexion(@Valid @ModelAttribute("login") Authentification auth, BindingResult result,HttpSession ses, Model model) {
		
		
		User j = daoUser.auth(auth.getLogin(), auth.getMdp());
		Admin a = daoAdmin.auth(auth.getLogin(), auth.getMdp());

		if (j != null) {
			model.addAttribute("utilisateur", j);
			System.out.println(j);
			ses.setAttribute("login", auth);
			return "redirect:./home";
		} else if (a != null) {
			model.addAttribute("utilisateur", a);
			System.out.println(j);
			ses.setAttribute("login", auth);
			return "redirect:./home";
		} else 	{
			
			result.rejectValue("login", "login.false", "Vos identifiants sont invalides connard de merde");
			return "connexion";
		}
	}
	
	@GetMapping("/deconnection")
	public String deconnect(HttpSession ses) {
		ses.invalidate();
		return "redirect:./home";
	}
	
}
