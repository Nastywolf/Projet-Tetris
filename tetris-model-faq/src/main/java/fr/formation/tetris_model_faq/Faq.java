package fr.formation.tetris_model_faq;

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
@Table(name = "faq")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Faq implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FAQ_ID")
	private int id;

	@Column(name = "FAQ_QUESTION")
	private String question;

	@Column(name = "FAQ_REPONSE")
	private String reponse;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	@Override
	public String toString() {
		return "Faq [getId()=" + getId() + ", getQuestion()=" + getQuestion() + ", getReponse()=" + getReponse() + "]";
	}

}
