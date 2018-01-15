package fr.formation.tetris_dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.formation.tetris_model_tetrimino.*;

@Repository
public class TetriminoDAO {

	@Autowired
	private DataSource dataSource;
	
	
	public void findById(int id) {
		System.out.println("Recherche ...");
		try {
			dataSource.getConnection().createStatement().executeQuery("SELECT * from tetrimino");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public ArrayList<TetriminoModel> listePieces() throws SQLException, ClassNotFoundException{
		ArrayList<TetriminoModel> liste = new ArrayList<TetriminoModel>();

		ResultSet rs = dataSource.getConnection().createStatement().executeQuery("SELECT * from tetrimino");
		
		while(rs.next()){
			TetriminoModel t = new TetriminoModel();
			t.setId(rs.getInt(1));
			t.setNom(rs.getString(2));
			t.setCouleur(rs.getString(3));
			liste.add(t);
			}
		
		return liste;
		
	}
	
	public void addPiece(TetriminoModel tetrimino) throws ClassNotFoundException, SQLException{
		
		
		
		String str ="insert into tetrimino values (?,?,?)";

		PreparedStatement ps = dataSource.getConnection().prepareStatement(str);
		ps.setInt(1, tetrimino.getId());
		ps.setString(2,tetrimino.getNom());
		ps.setString(3, tetrimino.getCouleur());
		
		ps.executeUpdate();
		
		
	}
}
