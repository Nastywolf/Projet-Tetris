package fr.formation.tetris_model_tetrimino;

public class TetriminoModel {

	private int id;
	private String nom;
	private String couleur;

	public TetriminoModel() {

	}

	public TetriminoModel(int id, String nom, String couleur) {
		this.id = id;
		this.nom = nom;
		this.couleur = couleur;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
