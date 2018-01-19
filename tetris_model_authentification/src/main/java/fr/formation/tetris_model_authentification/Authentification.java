package fr.formation.tetris_model_authentification;

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
@Table(name = "authentification")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Authentification implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUTH_ID")
	private int id;

	@Column(name = "AUTH_LOGIN", columnDefinition = "VARCHAR(45)")
	//@NotEmpty
	private String login;

	@Column(name = "AUTH_MDP", columnDefinition = "VARCHAR(45)")
	//@NotEmpty
	private String mdp;

	@Column(name = "AUTH_TYPE", columnDefinition = "VARCHAR(45)")
	//@NotEmpty
	private String type;

	public Authentification() {

	}

	public int getId() {
		return id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Authentification [getId()=" + getId() + ", getLogin()=" + getLogin() + ", getMdp()=" + getMdp()
				+ ", getType()=" + getType() + "]";
	}

}
