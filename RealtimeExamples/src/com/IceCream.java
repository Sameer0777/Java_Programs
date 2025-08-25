package com;

public class IceCream {
	String name;
	double price;
	String flavour;
	String type;
	double size;
	
	public IceCream(String name, double price, String flavour, String type,double size) {
		this.name = name;
		this.price = price;
		this.flavour = flavour;
		this.type = type;
		this.size=size;
	}
	
	void eatIceCream() {
		System.out.println("Eating "+flavour+" Flavoured Ice Cream of "+size+" Ml....");
	}
	
}
