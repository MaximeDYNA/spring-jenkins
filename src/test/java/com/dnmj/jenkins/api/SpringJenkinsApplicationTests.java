package com.dnmj.jenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	Logger.info("Test case executing...");


	@Test
	void contextLoads() {
		Logger.info("Test case executing...");
		assertEquals(true, true);
	}

}