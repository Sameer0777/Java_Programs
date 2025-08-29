package com;

public class Practice {
	public static void main(String[] args) {
		int n=3456;
		int rem=0,c=0;//if double is used answer changes. 
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				c++;
			}
			n=n/10;
		}
		System.out.println(c);
	}
}
