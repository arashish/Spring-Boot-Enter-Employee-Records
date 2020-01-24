package com.rest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	
	private String Name;
	private int Points;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPoints() {
		return Points;
	}
	public void setPoints(int points) {
		Points = points;
	}
	
	
	
	
}
