package com.messageproducer.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public abstract class Message {
	private Long messageId;
	private String message;
	private int messageType;
	private Timestamp timeStamp;
	
	public Message(Long messageId, int messageType, String message, Timestamp timeStamp) {
		this.messageId=messageId;
		this.messageType=messageType;
		this.message=message;
		this.timeStamp=timeStamp;
	}
}
