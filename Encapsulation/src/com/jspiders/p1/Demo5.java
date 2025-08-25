package com.jspiders.p1;

public class Demo5 {
	
	public int x=10;
	
	private Demo5() {
		System.out.println("running Demo5 constructor");
	}
	
	public void test() {
		System.out.println("running test() method");
	}
	public static void display() {
		Demo5 d1=new Demo5();
		System.out.println("x value is: "+d1.x);
		d1.test();
	}
}


