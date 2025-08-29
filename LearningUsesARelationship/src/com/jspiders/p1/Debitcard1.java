package com.jspiders.p1;

public class Debitcard1 {
	long cardnum;
	double balance;
	int pin;
	
	public Debitcard1(long cardnum, double balance, int pin) {
		this.cardnum = cardnum;
		this.balance = balance;
		this.pin = pin;
	}
	
	void viewCardBalance() {
		System.out.println("Balance is rs: "+balance);
	}	
}
