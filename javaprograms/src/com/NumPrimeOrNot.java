package com;
import java.util.Scanner;
public class NumPrimeOrNot {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=ip.nextInt();
		int rem=0,sum=0,c=0;
		while(n!=0) {
			rem=n%10;
			sum=sum+rem;
			//System.out.println(rem);
			n=n/10;
		}
		//System.out.println(sum);
		for(int i=1;i<=sum;i++) {
			if(sum%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}
}
