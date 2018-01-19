package fr.formation.tetris_model_authentification;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "user")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class User extends Authentification {
	
	public User() {
		super();
		this.setType("User");
	}
}
