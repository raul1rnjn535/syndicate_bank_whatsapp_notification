package com.messageproducer.model;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class TransactionMessage extends Message implements Serializable {
	private String contactNumber;
	
	public TransactionMessage(Long messageId, int messageType, String message, Timestamp timeStamp, String contactNumber) {
		super(messageId, messageType, message, timeStamp);
		this.contactNumber=contactNumber;
	}
}
