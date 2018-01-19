package fr.formation.tetris_model_tetrimino;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "coup")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Coup implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COUP_ID")
	private int id;

	@ManyToOne
	@JoinColumn(name = "COUP_PARTIE_ID")
	private Partie partie;

	@OneToMany(mappedBy = "coup")
	private TetriminoModel piece;

	public Coup() {
	}

	public Partie getPartie() {
		return partie;
	}

	public void setPartie(Partie partie) {
		this.partie = partie;
	}

	public TetriminoModel getPiece() {
		return piece;
	}

	public void setPiece(TetriminoModel piece) {
		this.piece = piece;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Coup [getPartie()=" + getPartie() + ", getPiece()=" + getPiece() + ", getId()=" + getId() + "]";
	}

}
