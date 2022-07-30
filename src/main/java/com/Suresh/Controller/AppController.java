package com.Suresh.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class AppController {

	private Logger logger = LoggerFactory.getLogger(AppController.class);
	
	@GetMapping("/m3")
	public String methodThree() {
		logger.info("*********** insider methodThreee ********");
		logger.info("*** done with MicroService -3");
		return "returning from microservice -3";
	}
}
