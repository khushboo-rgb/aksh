package com.practice.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.main.CourseApiDataApplication;
import com.practice.model.Topicpojo;
import com.practice.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	private static final Logger log = LoggerFactory.getLogger(TopicService.class);
	public List<Topicpojo> getAllTopis()
	{
		log.warn("displaying the list of all the topics");
		List<Topicpojo> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public Optional<Topicpojo> getTopic(String id)
	{
		
		return topicRepository.findById(id);
	}

	public void addTopic(Topicpojo Topicpojo) {
	topicRepository.save(Topicpojo);
		
	}

	public void updateTopic(String id, Topicpojo Topicpojo) {
		
		topicRepository.save(Topicpojo);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	
	}
}
