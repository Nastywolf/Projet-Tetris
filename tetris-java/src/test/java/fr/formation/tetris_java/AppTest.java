package fr.formation.tetris_java;

import static org.junit.Assert.*;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.formation.config.DAOConfig;
import fr.formation.tetris_dao.*;
import fr.formation.tetris_model_tetrimino.*;

@ContextConfiguration(classes = { DAOConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest {


	@Autowired(required = false)
	private ITetriminoDAO daoT;


	@Test
	@Rollback(true)
	@Transactional
	public void modifierTetrimino() {
	Optional<TetriminoModel> myOptionalTetrimino = daoT.findById(1);
		TetriminoModel myTetrimino;

		assertTrue(myOptionalTetrimino.isPresent());
		myTetrimino = myOptionalTetrimino.get();

		assertNotNull(myTetrimino);

		myTetrimino.setNom("test");
		daoT.save(myTetrimino);

		assertEquals("test", daoT.findById(1).get().getNom());

	}
	@Test
	@Rollback(true)
	@Transactional
	public void testDeleteTetrimino() {
		try{
			daoT.deleteById(1);
			assertFalse(daoT.findById(1).isPresent());
		}
		catch(Exception e){
			fail("n'as pas pu supprimer");
		}
	}
	@Test
	@Rollback(true)
	@Transactional
	public void AjouterTetrimino() {
		TetriminoModel myTetrimino = new TetriminoModel();
		
		myTetrimino.setCouleur("Vert");
		myTetrimino.setNom("Le petit vers de terre");
		myTetrimino.setForme("1,1/");
		daoT.save(myTetrimino);
		
		assertNotEquals(0,myTetrimino.getId());
	}
	
	@Test
	@Transactional
	public void RotationTetriminoTest(){
		TetriminoModel myTetrimino = new TetriminoModel();
		myTetrimino.setForme("1,1,0,/0,1,0,/");
		
		assertEquals("0,0,/1,1,/1,0,/",myTetrimino.getForme90());
		
		assertEquals("0,1,0,/0,1,1,/",myTetrimino.getForme180());
		
		assertEquals("0,1,/1,1,/0,0,/",myTetrimino.getForme270());
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
