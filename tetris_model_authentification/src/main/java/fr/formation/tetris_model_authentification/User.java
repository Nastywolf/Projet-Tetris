package fr.formation.tetris_model_authentification;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "user")
@PrimaryKeyJoinColumn(name = "USER_ID", referencedColumnName = "AUTH_ID")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User extends Authentification implements Serializable {
	
	public User() {
		super();
		this.setType("User");
	}
}
