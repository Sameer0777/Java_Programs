package com;

public class Customer {
	String name;
	char gender;
	int age;
	IceCream lovedOne;
	
	public Customer(String name,char gender,int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	void orderIceCream(IceCreamShop ics,String name,double price,String flavour,String type,double size) {
		lovedOne=ics.getIceCream(name, price, flavour, type,size);
	}
	
	void eatLovedOne() {
		lovedOne.eatIceCream();
	}
}
