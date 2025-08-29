package com.jspiders.p1;

public class MainClass1 {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		ATM1 a1=new ATM1(64378,"BTM","SBI");
		
		Debitcard1 d1=new Debitcard1(435474567438l,10000.00,1234);
		
		System.out.println("Before Withdraw");
		d1.viewCardBalance();
		a1.withdrawMoney(d1, 1234, 3000);
		System.out.println("After Withdraw");
		d1.viewCardBalance();
		
		System.out.println("Main Method Ended");
		
	}
}
