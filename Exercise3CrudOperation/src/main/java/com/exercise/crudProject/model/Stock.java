package com.exercise.crudProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
	private int id;
	private String name;
	private int currentPrice;
	private int date_Created;
	private int last_Updated;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	public int getDate_Created() {
		return date_Created;
	}
	public void setDate_Created(int date_Created) {
		this.date_Created = date_Created;
	}
	public int getLast_Updated() {
		return last_Updated;
	}
	public void setLast_Updated(int last_Updated) {
		this.last_Updated = last_Updated;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", currentPrice=" + currentPrice + ", date_Created="
				+ date_Created + ", last_Updated=" + last_Updated + "]";
	}

}
