package com.jspiders.p1;

public class DebitCard {
	String banme;
	String uname;
	long dnum;
	double balance;
	
	public DebitCard(String banme, String uname, long dnum, double balance) {
		this.banme = banme;
		this.uname = uname;
		this.dnum = dnum;
		this.balance = balance;
	}
	
	void debit() {
		System.out.println("Money Debited");
	}
}
