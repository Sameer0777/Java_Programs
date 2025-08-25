package com;

public class NthPrimeFGP {
	static boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int c=0,key=4,sp=6;
		for(int i=sp;;i++) {
			if(isPrime(i)==true) {
				c++;
			}
			if(c==key) {
				System.out.println(i);
				break;
			}
		}
	}
}
