package fr.formation.tetris_model_tetrimino;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import fr.formation.tetris_model_authentification.User;

@Entity
@Table(name = "partie")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Partie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PARTIE_ID")
	private int id;

	@ManyToOne
	@JoinColumn(name = "PARTIE_AUTH_ID")
	private User joueur;

	@Column(name = "PARTIE_DATE")
	//@NotEmpty
	private Date date;

	@Column(name = "PARTIE_SCORE")
	private int score = 0;
	
	@OneToMany(mappedBy="partie")
	private List<Coup> coups;

	public User getJoueur() {
		return joueur;
	}

	public void setJoueur(User joueur) {
		this.joueur = joueur;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Partie [getJoueur()=" + getJoueur() + ", getDate()=" + getDate() + ", getScore()=" + getScore()
				+ ", getId()=" + getId() + "]";
	}

}
