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


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(DAOConfig.class);
    	Environment myEnv = myContext.getBean(Environment.class);
		ITetriminoDAO daoT = myContext.getBean(ITetriminoDAO.class);
		ICoupDAO daoC = myContext.getBean(ICoupDAO.class);
		IPartieDAO daoP = myContext.getBean(IPartieDAO.class);
		IUserDAO daoU = myContext.getBean(IUserDAO.class);
		IAdminDAO daoA = myContext.getBean(IAdminDAO.class);
		
		Admin a1 = new Admin();
		a1.setLogin("Batman");
		a1.setMdp("ImNotGay");
		
		daoA.save(a1);
	myContext.close();
    }
}
