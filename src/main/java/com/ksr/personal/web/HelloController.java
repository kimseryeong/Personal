package com.ksr.personal.web;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import org.json.simple.JSONObject;

@RestController
public class HelloController {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@GetMapping("/api/hello")
	public String hello() {

		log.info("========== log url :: /api/hello");
		
		
		// List<String> resultList = Arrays.asList("title", "Hello, Wrold! 2024-08-02 :>");
		// log.info("========== resultList :: " + resultList);

		return "Good Morning! Today is 2024-08-05 :>";
	}
}
