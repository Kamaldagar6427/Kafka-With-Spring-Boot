package com.kafka.kafkaWithSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.kafkaWithSpring.producer.MessageProducer;

@RestController
public class KafkaController {

	@Autowired
	private MessageProducer messageProducer;
	
	@PostMapping("/send")
	public String sendMessage(@RequestBody String message) {
		messageProducer.sendMessage("spring", message);
		return "Message Sent : "  + message;
	}
}
