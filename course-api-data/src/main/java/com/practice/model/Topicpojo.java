package com.practice.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topicpojo")
public class Topicpojo {

	@Id 
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Topicpojo() {
		
	}
	public Topicpojo(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Topicpojo [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
