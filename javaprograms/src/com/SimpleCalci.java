package com;
import java.util.Scanner;
public class SimpleCalci {
	static int add(int a,int b) {
		return a+b;
	}
	static int sub(int a,int b) {
		return a-b;
	}
	static int div(int a,int b) {
		return a/b;
	}
	static int mod(int a,int b) {
		return a%b;
	}
	static int mul(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
		System.out.println("=====Simple Calci======");
		
		Scanner f=new Scanner(System.in);
		
		while(true) {
			System.out.println("====Menu===");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.Mul");
			System.out.println("4.Div");
			System.out.println("5.Mod");
			System.out.println("6.Exit");
			System.out.println("====Enter Your Option====");
			int n=f.nextInt();
			int a=0,b=0;
			if(n>0 && n<=5) {
			System.out.println("==Enter Number1==");
			 a=f.nextInt();
			System.out.println("==Enter Number2==");
			 b=f.nextInt();
		}
			switch(n) {
			case 1:System.out.println("===============");
					System.out.println("Add: "+add(a,b));
			break;
			case 2:System.out.println("===============");
			System.out.println("Sub: "+sub(a,b));
			break;
			case 3:System.out.println("===============");
			System.out.println("Mul: "+mul(a,b));
			break;
			case 4:System.out.println("===============");
			System.out.println("Div: "+div(a,b));
			break;
			case 5:System.out.println("===============");
			System.out.println("Mod: "+mod(a,b));
			break;
			case 6:System.out.println("===============");
			System.out.println("Thank You Visit Again!!!!!");
			System.exit(0);
			default:System.out.println("Invalid Choice");
			
			}
		
	}
}
}