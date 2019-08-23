package com.messageproducer.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public abstract class Message {
	private Long messageId;
	private String message;
	private Timestamp timeStamp;
}
