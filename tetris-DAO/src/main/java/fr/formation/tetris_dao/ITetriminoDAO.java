package fr.formation.tetris_dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.tetris_model_tetrimino.TetriminoModel;

public interface ITetriminoDAO extends JpaRepository<TetriminoModel, Integer> {

}
