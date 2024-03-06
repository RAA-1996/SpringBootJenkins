package com.cogent.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
	
	static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
	
	@PostConstruct
//	void init()
	{
		log.debug("Init post-Construct statement!");
	}

	public static void main(String[] args) {
		log.error("Found our First Statement of Main!");
		log.debug("Build Pipeline Configuration...");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
