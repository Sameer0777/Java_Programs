package com;

public class PalindromeNum {
		public static void main(String[] args) {
			int n=808;
			int temp=0,rev=0;
			int c=n;
			while(n!=0) {
				temp=n%10;
				rev=(rev*10)+temp;
				n=n/10;
			}
			if(c==rev) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
}
