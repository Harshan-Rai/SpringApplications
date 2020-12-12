package com.project.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.kafka.entity.Employee;
import com.project.kafka.publish.EmployeeMapping;


@RestController
public class Post {
	
	@Autowired
	private EmployeeMapping publishEmp;
	
	private Logger log = LoggerFactory.getLogger(Post.class);
	
	@RequestMapping(value = "/producer/publish-message", method = { RequestMethod.POST}, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String publishMessage(@RequestBody Employee emp, @RequestParam String key) throws JsonProcessingException {
		
	
		log.info("\nFor key : "+ key + "........" + "......\n" + emp);
		
		publishEmp.publish(key, emp);

		return "Data Sent successfully";

	}

}
