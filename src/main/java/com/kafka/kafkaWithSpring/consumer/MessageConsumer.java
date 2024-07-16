package com.kafka.kafkaWithSpring.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

	@KafkaListener(topics = "spring", groupId = "spring-group")
	public void listen(String message) {
		System.out.println("Received Message : "+ message);
	}
}
