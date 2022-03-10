package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	@EmbeddedId /*usado em chave composta*/
	private ScorePK id =  new ScorePK();
	
	private Double value;
	
	public Score() {
		
	}
	
	/* Associação entre o score e o filme */
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	/* Associação entre o score e o usuario */
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	

}
