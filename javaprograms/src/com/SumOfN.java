package com;
import java.util.Scanner;
public class SumOfN {
	public static void main(String[] args) {
		Scanner h=new Scanner(System.in);
		int i,sum=0;
		System.out.println("Enter the Number:");
		int f=h.nextInt();
		for(i=1;i<=f;i++) {
			sum+=i;
		}
		System.out.println("Sum of the Given Number is:"+sum);
	}

}
