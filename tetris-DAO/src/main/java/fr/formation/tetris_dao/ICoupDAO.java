package fr.formation.tetris_dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.tetris_model_tetrimino.Coup;


public interface ICoupDAO extends JpaRepository<Coup, Integer>{

}
