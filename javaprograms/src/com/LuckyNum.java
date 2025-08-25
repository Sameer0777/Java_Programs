package com;
import java.util.Scanner; 
public class LuckyNum {
	static boolean isPrime(int t) {
		int c=0;
		for(int i=1;i<=t;i++) {
			if(t%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id=ip.nextInt();
		int rem=0,sum=0,c=0;
		while(id!=0) {
			rem=id%10;
			sum=sum+rem;
			id=id/10;
			c++;
			if(c==4) {
				break;
			}
	}
		System.out.println(sum);
		boolean res=isPrime(sum);
		if(res==true) {
			System.out.println("Lucky Employee");
		}
		else {
			System.out.println("Not A Lucky Employee");
		}
		
}
}
