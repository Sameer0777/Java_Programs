package com.jspiders.p1;

public class ATM1 {
	
	int id;
	String location;
	String bankname;
	
	public ATM1(int id, String location, String bankname) {
		this.id = id;
		this.location = location;
		this.bankname = bankname;
	}
	
	void withdrawMoney(Debitcard1 card, int enteredpin, double amount) {
		if(enteredpin==card.pin) {
			if(amount<card.balance) {
				card.balance=card.balance-amount;
			}
			else {
				System.out.println("Insufficient balance, cannot do withdraw");
			}
		}
		else {
			System.out.println("Invalid PIN canoot withdraw");
		}
	}
}
