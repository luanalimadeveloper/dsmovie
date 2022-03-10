package com.devsuperior.dsmovie.entities;

public class Score {
	
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
