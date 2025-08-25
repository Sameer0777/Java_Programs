package com;

public class SunnyNum {
	public static void main(String[] args) {
		int n=25;
		boolean flag=false;
		for(int i=1;i<=n;i++) {
			if((i*i)==(n+1)) {
				flag=true;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Sunny Number");
		}
		else {
			System.out.println("Not a Sunny Number");
		}
	}

}
