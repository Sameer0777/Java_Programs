package com;
import java.util.Scanner;
public class PrintNto1 {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=b.nextInt();
		for (int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}

}
