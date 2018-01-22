package fr.formation.tetris_model_tetrimino;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@Column(name = "TETRIMINO_FORME_BASE")
	private String forme;
	
	@Column(name = "TETRIMINO_FORME_90")
	private String forme90;
	
	@Column(name = "TETRIMINO_FORME_180")
	private String forme180;
	
	@Column(name = "TETRIMINO_FORME_270")
	private String forme270;
	
	@OneToMany(mappedBy="piece")
	private List<Coup> coups;
	
	public TetriminoModel() {

	}
	
	
	public void setId(int id) {
		this.id = id;
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
	

	public String getForme() {
		return forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
		this.forme90=rotate(this.forme);
		this.forme180=rotate(this.forme90);
		this.forme270=rotate(this.forme180);
		
	}

	public String getForme90() {
		return forme90;
	}

	public String getForme180() {
		return forme180;
	}

	public String getForme270() {
		return forme270;
	}

	
	
	
	public List<Coup> getCoups() {
		return coups;
	}

	public void setCoups(List<Coup> coups) {
		this.coups = coups;
	}

	@Override
	public String toString() {
		return "TetriminoModel [id=" + id + ", nom=" + nom + ", couleur=" + couleur + "]";
	}

	private static String rotate(String forme){
		//rotation dans le sens trigonométrique (anti-horaire)
		String res = "";
		String[] temp = forme.split("/");
		int h = temp.length;
		
		String[][] mat= new String[h][];
		
		for (int i =0; i<h; i++){
			mat[i] = temp[i].split(",");
		}
		int l = mat[0].length;

		for(int i = 0; i<l; i++){
			for (int j = 0; j<h; j++){
				res+=mat[j][l-i-1]+",";
			}
			res+="/";
		}
		return res;
	}
	
}
