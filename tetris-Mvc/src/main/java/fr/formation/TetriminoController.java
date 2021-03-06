package fr.formation;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.formation.tetris_dao.ITetriminoDAO;
import fr.formation.tetris_model_tetrimino.TetriminoModel;

@Controller
@RequestMapping(value = "/tetrimino")
public class TetriminoController {

	@Autowired
	private ITetriminoDAO daoTetrimino;

	@ModelAttribute("page")
	public String page() {
		return "tetrimino";
	}

	@GetMapping("")
	public String liste(Model model) {
		model.addAttribute("tetrimino", daoTetrimino.findAll());
		return "tetrimino";
	}

	@GetMapping("/tailleadd")
	public String taille(Model model) {
		model.addAttribute("mode", "ajouter");
		return "tetriminotaille";
	}

	@GetMapping("/tailleed")
	public String taille(@RequestParam("id") int id, Model model) {
		model.addAttribute("mode", "editer");
		model.addAttribute("id", id);
		return "tetriminotaille";
	}

	@GetMapping("/ajouter")
	public String ajouter(Model model, @RequestParam int taille) {
		model.addAttribute("taille", taille);
		model.addAttribute("tetrimino", new TetriminoModel());
		return "tetriminoedit";
	}

	@PostMapping("/ajouter")
	public String ajouter(@Valid @ModelAttribute("tetrimino") TetriminoModel tetrimino, BindingResult result,
			Model model, HttpServletRequest request) {
		if (result.hasErrors()) {
			return "tetriminoedit";
		}

		int taille = Integer.parseInt(request.getParameter("taille"));
		String val = "";
		String res = "";
		for (int i = 1; i < taille+1; i++) {
			for (int j = 1; j < taille+1; j++) {
				val = request.getParameter(i + "." + j);
				if (val != null) {
					res += "1";
				} else {
					res += "0";
				}
				res += ",";
			}
			res += "/";
		}
		tetrimino.setForme(res);
		daoTetrimino.save(tetrimino);

		return "redirect:.";
	}

	@GetMapping("/editer")
	public String editer(@RequestParam("id") int id, Model model, @RequestParam("taille") int taille) {
		model.addAttribute("taille", taille);
		model.addAttribute("tetrimino", daoTetrimino.findById(id).get());
		return "tetriminoedit";
	}

	@PostMapping("/editer")
	public String editer(@Valid @ModelAttribute("tetrimino") TetriminoModel tetrimino, BindingResult result,
			@RequestParam("id") int id, Model model, HttpServletRequest request) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "tetriminoedit";
		}

		int taille = Integer.parseInt(request.getParameter("taille"));
		String val = "";
		String res = "";
		for (int i = 1; i < taille+1; i++) {
			for (int j = 1; j < taille+1; j++) {
				val = request.getParameter(i + "." + j);
				if (val != null) {
					res += "1";
				} else {
					res += "0";
				}
				res += ",";
			}
			res += "/";
		}
		tetrimino.setForme(res);
		daoTetrimino.save(tetrimino);

		return "redirect:.";
	}

	@GetMapping("/supprimer")
	public String supprimer(@RequestParam("id") int id) {
		daoTetrimino.deleteById(id);

		return "redirect:.";
	}

}
