package com.jspiders.p1;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Atm a1=new Atm(5000,871);
		DebitCard d1=new DebitCard("SBI","SAM",12234678l,6000);
		
		a1.witDrawMoney(d1,5000, 6000);
		
		System.out.println("Main Method Ended");
	}
}
