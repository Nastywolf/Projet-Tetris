package fr.formation.tetris_model_authentification;

public abstract class Authentification {
	private int id;
	private String login;
	private String mdp;

	public Authentification() {

	}

	public Authentification(int id, String login, String mdp) {

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
