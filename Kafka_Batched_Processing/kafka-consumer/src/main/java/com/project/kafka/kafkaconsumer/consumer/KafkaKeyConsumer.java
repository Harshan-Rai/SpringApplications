package com.project.kafka.kafkaconsumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaKeyConsumer {

	private static final Logger log = LoggerFactory.getLogger(KafkaKeyConsumer.class);

	@KafkaListener(topics = "t_emp_0")
	public void consume1(ConsumerRecord<String, String> message) throws InterruptedException {
		log.info("Key : {}, Topic Name : {}, Message : {}", message.key(), message.topic(), message.value());
		
	}
	
	@KafkaListener(topics = "t_emp_1")
	public void consume2(ConsumerRecord<String, String> message) throws InterruptedException {
		log.info("Key : {}, Topic Name : {}, Message : {}", message.key(), message.topic(), message.value());
		
	}
	
	@KafkaListener(topics = "t_emp_2")
	public void consume3(ConsumerRecord<String, String> message) throws InterruptedException {
		log.info("Key : {}, Topic Name : {}, Message : {}", message.key(), message.topic(), message.value());
		
	}
	
	@KafkaListener(topics = "t_emp_3")
	public void consume4(ConsumerRecord<String, String> message) throws InterruptedException {
		log.info("Key : {}, Topic Name : {}, Message : {}", message.key(), message.topic(), message.value());
		
	}

}
