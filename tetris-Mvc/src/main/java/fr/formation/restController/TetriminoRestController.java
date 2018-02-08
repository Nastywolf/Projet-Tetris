package fr.formation.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.tetris_dao.ITetriminoDAO;
import fr.formation.tetris_model_tetrimino.TetriminoModel;


@RestController
@RequestMapping("/tetriminos")
public class TetriminoRestController {

	@Autowired
	private ITetriminoDAO daoTetrimino;
	
	@GetMapping("")
	public List<TetriminoModel> findAll() {
		
		return this.daoTetrimino.findAll();
	}
	
}