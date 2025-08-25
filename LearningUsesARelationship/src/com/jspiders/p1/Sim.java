package com.jspiders.p1;

public class Sim {
	String bname;
	double currency;
	double data;
	String type;
	
	public Sim(String bname, double currency, double data, String type) {
		
		this.bname = bname;
		this.currency = currency;
		this.data = data;
		this.type=type;
	}
	void simDetails() {
		System.out.println("Balance: "+currency);
		System.out.println("Data Balancce: "+data);
		System.out.println("Sim Type: "+type);
	}
	
	
}
