package fr.formation.tetris_dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.tetris_model_tetrimino.Authentification;


public interface IAuthentificationDAO extends JpaRepository<Authentification, Integer> {

}
