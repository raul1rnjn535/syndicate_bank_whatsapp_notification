package com.messageproducer.controller;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.messageproducer.producer.ProduceMessage;

@RestController
@RequestMapping("/gateway/push")
@Component
public class PostMessageController {
	
	@Autowired
	private ActiveMQConnectionFactory activeMQConnectionFactory;
	
//	@PostMapping("/mType/{mType}/contactNum/{contactNum}/meassage{message}")
//	void PostTransactionMessage(@PathVariable int mType, @PathVariable String contactNum, @PathVariable String message) {
	@GetMapping("/transaction/mType/{mType}")
	void PushTransactionMessage(@PathVariable int mType) {
		ProduceMessage producer = new ProduceMessage(activeMQConnectionFactory);
		producer.publishMessage();
		System.out.println("Hello World!");
		
	}
}
