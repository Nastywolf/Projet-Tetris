package fr.formation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/tetrimino")
public class TetriminoController {

	@GetMapping
	public String liste(Model model) {
		return "listeFAQ";
	}
}
