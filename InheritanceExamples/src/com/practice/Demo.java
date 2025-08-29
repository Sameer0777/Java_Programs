package com.practice;

public class Demo {
	int x=100;
}

class Demo1 extends Demo{
	int x=200;
	void display() {
		int x=300;
		System.out.println("Local Variable: "+x);
		System.out.println("Sub Class x value: "+this.x);
		System.out.println("Super Class x value: "+super.x);
	}
}
