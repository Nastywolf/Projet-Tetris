package fr.formation.tetris_model_tetrimino;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="tetrimino")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class TetriminoModel implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TETRIMINO_ID")
	private int id;
	
	@Column(name="TETRIMINO_NOM", columnDefinition="VARCHAR(45)")
	//@NotEmpty
	//@Size(max=50)
	private String nom;
	
	@Column(name = "TETRIMINO_COULEUR", columnDefinition = "VARCHAR(45)")
	//@NotEmpty
	//@Size(max=50)
	//format RGB
	private String couleur;

	public TetriminoModel() {

	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "TetriminoModel [id=" + id + ", nom=" + nom + ", couleur=" + couleur + "]";
	}

	
}
