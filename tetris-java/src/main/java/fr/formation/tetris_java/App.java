package fr.formation.tetris_java;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import fr.formation.config.*;
import fr.formation.tetris_model_tetrimino.TetriminoModel;


public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
//
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
