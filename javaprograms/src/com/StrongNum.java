package com;

public class StrongNum {
		public static void main(String[] args) {
			int n=145;
			int temp=n;
			int sum=0,rem=0;
			while(n!=0) {
				rem=n%10;
				int fact=1;
				for(int i=1;i<=rem;i++) {
					fact=fact*i;
				}
				sum=sum+fact;
				n=n/10;
			}
			System.out.println(sum);
			if(sum==temp) {
				System.out.println("Strong Number");
			}
			else {
				System.out.println("Not a Strong Number");
			}
			
		}
}
