package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.tetris_dao.ITetriminoDAO;

@Controller
@RequestMapping(value="/tetrimino")
public class TetriminoController {

	@Autowired
	private ITetriminoDAO daoTetrimino;
	
	@GetMapping("")
	public String liste(Model model) {
		model.addAttribute("tetrimino", daoTetrimino.findAll());
		return "tetrimino";
	}
}
