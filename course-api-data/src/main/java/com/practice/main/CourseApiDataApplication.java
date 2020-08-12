package com.practice.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.practice.controller.TopicController;
@EnableJpaRepositories(basePackages="com.practice")
@SpringBootApplication(scanBasePackages="com.practice")
@EntityScan(basePackages="com.practice")
@EnableAutoConfiguration
public class CourseApiDataApplication {
	
	private static final Logger log = LoggerFactory.getLogger(CourseApiDataApplication.class);

	public static void main(String[] args) {
		log.info("Starting the execution from CourseApiDataApplication");
		SpringApplication.run(CourseApiDataApplication.class, args);
	}

}
