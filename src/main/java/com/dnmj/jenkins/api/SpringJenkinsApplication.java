package com.dnmj.jenkins.api;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	
	@PostConstruct
	public void intt() {
		Logger.info("Application started...");
	}

	public static void main(String[] args) {
		Logger.info("Application executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
