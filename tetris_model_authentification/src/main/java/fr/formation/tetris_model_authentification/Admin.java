package fr.formation.tetris_model_authentification;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "admin")
@PrimaryKeyJoinColumn(name = "ADMIN_ID", referencedColumnName = "AUTH_ID")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Admin extends Authentification implements Serializable{

	public Admin() {
		super();
		this.setType("Admin");
	}
}
