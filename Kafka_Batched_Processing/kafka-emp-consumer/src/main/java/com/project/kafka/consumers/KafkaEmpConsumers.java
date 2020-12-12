package com.project.kafka.consumers;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaEmpConsumers {
	
	private static final Logger log = LoggerFactory.getLogger(KafkaEmpConsumers.class);
	
	@KafkaListener(topics = "test_emp_1")
	public void consume33(ConsumerRecord<String, String> message) {
		log.info("Key : {}, Topic Name {}, Message : {}", message.key(), message.topic(), message.value());
	}
}
