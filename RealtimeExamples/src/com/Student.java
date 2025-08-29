package com;

public class Student {
	String name;
	int age;
	char gender;
	Pen favpen;//default initialization
	
	public Student(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	void buypen(StationaryShop shop,String brand,String color,String type,double price) {
		favpen=shop.getpen(brand, color, price, type);
	}
	void prepareNotes(String subject) {
		System.out.println("Preparing Notes: "+subject);
		favpen.write();
	}
	
	
	
}
