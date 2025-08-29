package com;

public class Pen {
	String brand;
	String color;
	double price;
	String type;
	
	public Pen(String brand, String color, double price, String type) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
	}
	
	void write() {
		System.out.println("Writing......");
	}	
}
