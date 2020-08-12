package com.practice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.practice.model.CoursePojo;

public interface CourseRepository extends CrudRepository<CoursePojo, String>{

	//public List<CoursePojo> findByName(String name);
	//public List<CoursePojo> findByDescription(String description);
	
	
	//we are finding by the object of the topic class not the field name so we have to mention it there
	public List<CoursePojo> findByTopicId(String id);
}
