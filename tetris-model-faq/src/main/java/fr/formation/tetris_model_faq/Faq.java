package fr.formation.tetris_model_faq;

public class Faq {
	private int id;
	private String question;
	private String reponse;

	public Faq() {
	}

	public Faq(int id, String question, String reponse) {
		super();
		this.id = id;
		this.question = question;
		this.reponse = reponse;
	}

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
