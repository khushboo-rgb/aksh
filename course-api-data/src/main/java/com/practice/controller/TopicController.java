package com.practice.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.main.CourseApiDataApplication;
import com.practice.model.Topicpojo;

import com.practice.service.TopicService;

@RestController

public class TopicController {
	private static final Logger log = LoggerFactory.getLogger(CourseApiDataApplication.class);
	@Autowired
	private TopicService topicService;
	
	
	
	@RequestMapping("/topics")
	public List<Topicpojo> getAllTopics()
	{
		log.info("inisde topic controller");
		return topicService.getAllTopis();
	}

	@RequestMapping("/topics/{id}")
	public Optional<Topicpojo> getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addToipcs(@RequestBody Topicpojo Topicpojo)
	{
		topicService.addTopic(Topicpojo);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateToipcs(@RequestBody Topicpojo Topicpojo, @PathVariable String id)
	{
		topicService.updateTopic(id,Topicpojo);
	}
	

	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteToipcs(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
}
