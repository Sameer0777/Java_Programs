package com.jspiders.p1;

public class Atm {
	double damount;
	int pin;
	
	public Atm(double damount, int pin) {
		this.damount = damount;
		this.pin = pin;
	}
	
	void witDrawMoney(DebitCard arg,double damount,double balance) {
		System.out.println("Balance: "+balance);
		if(damount<=balance) {
			System.out.println("WithDraw Money: "+damount);
			balance-=damount;
			arg.debit();
			System.out.println("Balance: "+balance);
		}
		
	}
	
}
