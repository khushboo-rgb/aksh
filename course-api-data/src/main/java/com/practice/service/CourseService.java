package com.practice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.model.CoursePojo;
import com.practice.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public Optional<CoursePojo> getCourseById(String id)
	{
		return courseRepository.findById(id);
		
	}
	
	
	

	public void addCourse(CoursePojo coursepojo) {
		courseRepository.save(coursepojo);
		
	}

	public void updateCourse(CoursePojo coursepojo) {
		courseRepository.save(coursepojo);
		
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
		
	}

	public List<CoursePojo> getAllCourse(String topicId) {
		List<CoursePojo> courselist = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courselist::add);
		return courselist;
	}

}
