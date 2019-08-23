package com.messageproducer.producer;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProduceMessage {

	private JmsTemplate jmsTemplate;
		
	public ProduceMessage(final ActiveMQConnectionFactory activeMQConnectionFactory) {
		System.out.println(activeMQConnectionFactory.getUserName() + "username");
		this.jmsTemplate = new JmsTemplate();
		this.jmsTemplate.setConnectionFactory(activeMQConnectionFactory);
	}
	
	public String publishMessage() {
		jmsTemplate.convertAndSend("transaction.queue","Fourth message");
		return "Published Message...";
	}
}
