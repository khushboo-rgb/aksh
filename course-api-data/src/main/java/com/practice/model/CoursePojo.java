package com.practice.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="coursepojo")
public class CoursePojo {

	@Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="topic_id")
	private Topicpojo topic;
	
	public CoursePojo() {
		
	}

	public Topicpojo getTopic() {
		return topic;
	}





	public void setTopic(Topicpojo topic) {
		this.topic = topic;
	}





	public CoursePojo(String id, String name, String description, Topicpojo topic) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = topic;
	}





	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "CoursePojo [ name=" + name + ", description=" + description + ", topic=" + topic + "]";
	}


	
	
	
	
}
