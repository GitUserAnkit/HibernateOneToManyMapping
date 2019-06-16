package com.ankit.hibernate.pojo;

import java.util.Set;

public class Actor {
	private int actorId;
	private String actorName;
	private Set<Movies> movie;

	public Actor() {

	}

	public Actor(int actorId, String actorName, Set<Movies> movie) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.movie = movie;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Set<Movies> getMovie() {
		return movie;
	}

	public void setMovie(Set<Movies> movie) {
		this.movie = movie;
	}

}
