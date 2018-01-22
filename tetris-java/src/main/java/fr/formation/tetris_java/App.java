package fr.formation.tetris_java;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import fr.formation.config.*;
import fr.formation.tetris_dao.*;
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
		//IClientDAO daoC = myContext.getBean(IClientDAO.class);
		
    	TetriminoModel t1 = new TetriminoModel();
    	t1.setForme("1,0,1,0/0,1,0,1/0,0,0,1/");
    	t1.setCouleur("rouge");
    	t1.setNom("Le petit marteau communiste");
    	t1.setId(1);
    	
    	System.out.println(t1);
    	User bob = daoU.findById(2).get();
    	
    	
//    	daoU.save(bob);
    	
    	Partie p1 = new Partie();
    	p1.setId(4);
    	p1.setJoueur(bob);
    	p1.setScore(500);
    	
    	Date d1 = new Date();
    	d1.getTime();
    	p1.setDate(d1);
    	
    	
    	daoP.save(p1);
    	

    	
//    	Coup c1 = new Coup();
//    	c1.setPartie(p1);
//    	
//    	daoC.save(c1);
//		
		
		
		
		
		
		
	myContext.close();
    }
}
