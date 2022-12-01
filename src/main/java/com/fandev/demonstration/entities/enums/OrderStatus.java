package com.fandev.demonstration.entities.enums;

public enum OrderStatus {
	
	Waiting_Payment (1),
	Paid (2),
	Shipped (3),
	Delivered (4),
	Canceled (5);

	private int code;
	
	private OrderStatus(int code) {
		
		this.code = code;
	}
	
	//retorna o código gerado pelo construtor
	public int getCode() {
		return code;
	}
	
	//recebe um código (numero inteiro) de Order e retorna um OrderStatus dependendo código passado
	public static OrderStatus valueOf(int code) {
		
		for(OrderStatus value : OrderStatus.values()) {
			
			if (value.getCode() == code) {
				return value;
			}	
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code.");
		
	}
}
