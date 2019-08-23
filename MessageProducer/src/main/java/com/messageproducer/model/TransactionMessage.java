package com.messageproducer.model;

import lombok.Data;

@Data
public class TransactionMessage extends Message {
	private String contactNumber;
}
