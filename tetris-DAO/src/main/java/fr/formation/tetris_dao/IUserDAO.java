package fr.formation.tetris_dao;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.formation.tetris_model_authentification.User;

public interface IUserDAO extends JpaRepository<User, Integer>{

}
