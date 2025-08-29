package com;

public class Cars {
	
	@Override
	public String toString() {
		return "Cars@100";
	}
	
	public static void main(String[] args) {
		
		Cars c = new Cars();
		
		System.out.println(c);
		System.out.println(c.toString());

	}

}
