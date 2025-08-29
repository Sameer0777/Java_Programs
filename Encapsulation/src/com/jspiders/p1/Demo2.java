package com.jspiders.p1;

public class Demo2 {
	
	void view() {
		Demo1 d1=new Demo1();
		//System.out.println("var 1 value is: "+d1.var1);
		System.out.println("var 2 value is: "+d1.var2);
		System.out.println("var 3 value is: "+d1.var3);
		System.out.println("var 4 value is: "+d1.var4);
		d1.display();
	}
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.view();
	}
}
