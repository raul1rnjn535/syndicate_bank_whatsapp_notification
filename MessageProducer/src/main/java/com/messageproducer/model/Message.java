package com.messageproducer.model;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class Message implements java.io.Serializable{
	private Long messageId;
	private String message;
	private int messageType;
	private Timestamp timeStamp;
	public Message(Long messageId, String message, int messageType, Timestamp timeStamp) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.messageType = messageType;
		this.timeStamp = timeStamp;
	}
	
	
	

}
