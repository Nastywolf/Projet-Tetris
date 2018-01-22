package fr.formation.tetris_dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.formation.tetris_model_tetrimino.Admin;


public interface IAdminDAO extends JpaRepository<Admin, Integer>{

	@Query("select a from Admin a where a.login = :login and a.mdp = :mdp")
	public Admin auth(@Param("login") String login, @Param("mdp") String mdp);
}
