package com;

public class DuckNum {
	public static void main(String[] args) {
		int n=2202,rem=0;//if we give starting number as 0 it is not a duck number
		boolean flag=false;
		while(n!=0) {
			rem=n%10;
			if(rem==0) {
				flag=true;
				break;
				/*System.out.println("Duck Number");
				break;*/
			}
			
			n=n/10;
		}
		if(flag==true) {
			System.out.println("Duck Number");
		}
		else {
			System.out.println("Not a Duck Number");
		}
		
		
	}

}
