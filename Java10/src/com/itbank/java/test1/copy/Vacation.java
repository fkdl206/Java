package com.itbank.java.test1.copy;

public abstract class Vacation {

	String location;
	int price;
	
	public Vacation() {}
	abstract void pay();
	
	void tour() {
		System.out.println("模备客咯青");
	}
}
