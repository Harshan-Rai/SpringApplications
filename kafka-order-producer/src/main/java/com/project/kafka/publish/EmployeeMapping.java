package com.project.kafka.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.kafka.entity.Employee;

@Service
public class EmployeeMapping {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private ObjectMapper objectMapper = new ObjectMapper();

	public void publish(String key, Employee emp) throws JsonProcessingException {
		
		var json = objectMapper.writeValueAsString(emp);
		
		if(key.equalsIgnoreCase("Key-0"))
			kafkaTemplate.send("t_emp_0", key, json);
		else if(key.equalsIgnoreCase("Key-1"))
			kafkaTemplate.send("t_emp_1", key, json);
		else if(key.equalsIgnoreCase("Key-2"))
			kafkaTemplate.send("t_emp_2", key, json);
		else if(key.equalsIgnoreCase("Key-3"))
			kafkaTemplate.send("t_emp_3", key, json);
		else
			System.out.println("Invalid-Key - " + key);
	}
}
