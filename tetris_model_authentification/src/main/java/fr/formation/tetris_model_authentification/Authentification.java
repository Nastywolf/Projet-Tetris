package fr.formation.tetris_model_authentification;

public class Authentification {
	private int id;
	private String login;
	private String mdp;

	public Authentification() {
		super();
	}

	public Authentification(int id, String login, String mdp) {
		super();
		this.id = id;
		this.login = login;
		this.mdp = mdp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Authentification [getId()=" + getId() + ", getLogin()=" + getLogin() + ", getMdp()=" + getMdp() + "]";
	}

}
