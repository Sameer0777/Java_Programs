package com.jspiders.p1;

public class Mobile {
	String brand;
	double storage;
	
	public Mobile(String brand,double storage) {
		
		this.brand = brand;
		this.storage = storage;
	}
	
	void call(Sim arg) {
		if(arg.currency==0 && arg.type=="4G") {
			System.out.println("Insufficient Balance");
			if(arg.data>=1) {
				System.out.println("Internet accessed");
			}
			else {
				System.out.println("Insufficient data");
			}
		}
		else {
			System.out.println("Call Initiated");
		}
	}
}
