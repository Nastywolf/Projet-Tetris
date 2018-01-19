package fr.formation.tetris_java;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import fr.formation.config.*;
import fr.formation.tetris_dao.IAuthentificationDAO;
import fr.formation.tetris_dao.ITetriminoDAO;
import fr.formation.tetris_model_tetrimino.TetriminoModel;

//import fr.formation.tetris_model_tetrimino.TetriminoModel;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(DAOConfig.class);
    	Environment myEnv = myContext.getBean(Environment.class);
		ITetriminoDAO daoT = myContext.getBean(ITetriminoDAO.class);
		IAuthentificationDAO daoA = myContext.getBean(IAuthentificationDAO.class);
		//IClientDAO daoC = myContext.getBean(IClientDAO.class);
		
//    	TetriminoModel t1 = new TetriminoModel();
//    	t1.setForme("1,0,1,0/0,1,0,1/0,0,0,1/");
//    	t1.setCouleur("rouge");
//    	t1.setNom("Le petit marteau communiste");
//    	
//    	daoT.save(t1);
//    	
//    	Authentification a1 = new Authentification();
//    	a1.setLogin("Robin");
//    	a1.setMdp("I love Batman");
//    	a1.setType("user");
//    	
//    	daoA.save(a1);
		
		
		
		
		
		
		
	myContext.close();
    }
}
