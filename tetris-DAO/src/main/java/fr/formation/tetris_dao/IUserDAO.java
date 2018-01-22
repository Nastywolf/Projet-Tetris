package fr.formation.tetris_dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.formation.tetris_model_tetrimino.User;

public interface IUserDAO extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.login =:login and u.mdp =:mdp")
	public User auth(@Param("login") String login, @Param("mdp") String mdp);
}
