package fr.formation.tetris_java;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import fr.formation.config.*;
import fr.formation.tetris_dao.*;
import fr.formation.tetris_model_tetrimino.Admin;
import fr.formation.tetris_model_tetrimino.Authentification;
import fr.formation.tetris_model_tetrimino.Coup;
import fr.formation.tetris_model_tetrimino.Partie;
import fr.formation.tetris_model_tetrimino.TetriminoModel;
import fr.formation.tetris_model_tetrimino.User;

//import fr.formation.tetris_model_tetrimino.TetriminoModel;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(DAOConfig.class);
		Environment myEnv = myContext.getBean(Environment.class);
		ITetriminoDAO daoT = myContext.getBean(ITetriminoDAO.class);
		ICoupDAO daoC = myContext.getBean(ICoupDAO.class);
		IPartieDAO daoP = myContext.getBean(IPartieDAO.class);
		IUserDAO daoU = myContext.getBean(IUserDAO.class);
		IAdminDAO daoA = myContext.getBean(IAdminDAO.class);

		// User j1 = new User();
		// j1.setLogin("Alberto");
		// j1.setMdp("azerty");
		//
		// daoU.save(j1);

		// System.out.println(daoU.auth("Monique", "azerty"));
		try {

			if (daoA.auth("Batman", "ImNotGay") != null) {

				System.out.println("Bienvenue " + daoA.auth("Batman", "ImNotGay"));
			} else
				throw new Exception();

		} catch (Exception e) {
			System.out.println("Erreur de connection");
		}
		
		try {

			if (daoU.auth("Monique", "azerty") != null) {

				System.out.println("Bienvenue " + daoU.auth("Monique", "azerty"));
			} else
				throw new Exception();

		} catch (Exception e) {
			System.out.println("Erreur de connection");
		}
		myContext.close();
	}
}
