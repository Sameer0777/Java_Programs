package com;

public class Person {
	int age;
	
	Person(int age){
		this.age=age;
	}
	
	@Override
	public String toString() {
		
		return "Age: "+age;
	}
	
	public static void main(String[] args) {
		
		Person p=new Person(21);
		
		System.out.println(p);
		System.out.println(p.toString());
	}
}
