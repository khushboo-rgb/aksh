package com.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.CoursePojo;
import com.practice.model.Topicpojo;
import com.practice.service.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<CoursePojo> getAllCourses(@PathVariable String id)
	{
		return courseService.getAllCourse(id);
	}

	@RequestMapping("/topics/{id}/courses/{id}")
	public Optional<CoursePojo> getCourse(@PathVariable String id)
	{
		return courseService.getCourseById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody CoursePojo coursepojo, @PathVariable String topicId)
	{ 
		coursepojo.setTopic(new Topicpojo(topicId,"",""));
        courseService.addCourse(coursepojo);		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody CoursePojo coursepojo, @PathVariable String topicId, @PathVariable String id)
	{
		coursepojo.setTopic(new Topicpojo(topicId,"",""));
	         courseService.updateCourse(coursepojo);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}/courses/{id}")
	public void deleteCourses(@PathVariable String id)
	{
		courseService.deleteCourse(id);
	}
	
}
