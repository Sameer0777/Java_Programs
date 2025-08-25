package com;

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Customer c=new Customer("Sameer",'M',21);
		IceCreamShop ics1=new IceCreamShop("Amul IceCream","Raichur",777);
		
		c.orderIceCream(ics1, "Amul Frostik", 45, "Chocolate", "Bar",100.00);
		c.eatLovedOne();
		
		System.out.println("Main Method Ended");
	}
}
