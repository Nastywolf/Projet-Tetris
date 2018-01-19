package fr.formation.tetris_java;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import fr.formation.config.*;
import fr.formation.tetris_model_tetrimino.TetriminoModel;

//import fr.formation.tetris_model_tetrimino.TetriminoModel;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(DAOConfig.class);
    	
    	TetriminoModel t1 = new TetriminoModel();
    	t1.setForme("1,0,1,0/0,1,0,1/0,0,0,1/1,1,1,1/2,2,2,2/");
    	System.out.println(t1.getForme());
    	System.out.println(t1.getForme90());
    	System.out.println(t1.getForme180());
    	System.out.println(t1.getForme270());
    	
//		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(DAOConfig.class);
//		TetriminoDAO tetriminoDAO = myContext.getBean(TetriminoDAO.class);
//		
//		TetriminoModel tetrimino = new TetriminoModel(4,"m","blanc");
//		tetriminoDAO.addPiece(tetrimino);
//		
//		//afficher toutes les pièces
//		
//		System.out.println(tetriminoDAO.listePieces());
//		
//		
//		myContext.close();
    }
}
